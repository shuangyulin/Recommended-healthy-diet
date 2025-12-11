<template>
	<view class="content">
		<view :style='{"minHeight":"100vh","width":"100%","padding":"0","position":"relative","background":"#fff3e8","height":"auto"}'>
			<view v-if="user&&user.id" :style='{"minHeight":"auto","padding":"0px 24rpx","margin":"0 0 20rpx 0","borderRadius":"0","background":"none","display":"flex","width":"100%","position":"unset","height":"auto"}' @tap="onPageTap('../user-info/user-info')" class="header" v-bind:class="{'status':isH5Plus}">
				<view :style='{"padding":"20rpx","margin":"200rpx 0 0 ","borderRadius":"20rpx","flexWrap":"wrap","flexDirection":"row","background":"#fa861c","display":"flex","width":"100%","position":"unset","height":"auto"}' v-if="tableName=='yonghu'" class="userinfo">
					<view :style='{"width":"calc(100% - 140rpx)","margin":"-240rpx 0 0","flexDirection":"column","background":"none","justifyContent":"center","display":"flex"}' class="info">
						<view :style='{"width":"auto","padding":"0","lineHeight":"48rpx","fontSize":"28rpx","color":"#333","textAlign":"left"}'>{{user.zhanghao}}<text v-if="user.vip&& user.vip=='是'">(VIP)</text></view>
					</view>
					
					<view :style='{"padding":"20rpx 40rpx","margin":"0px 0 0","color":"#333","borderRadius":"20rpx 20rpx 0 0","flexWrap":"wrap","background":"#fff3e8","display":"flex","width":"100%","clear":"both","fontSize":"28rpx","justifyContent":"space-between","order":"5"}' class="info">
						<view :style='{"width":"auto","margin":"0 20rpx 0 0","lineHeight":"48rpx","fontSize":"inherit","flexDirection":"column","display":"flex"}'>
							<span :style='{"color":"inherit","whiteSpace":"nowrap"}'>手机：</span>
							<span :style='{"color":"inherit"}'>{{user.shouji}}</span>
						</view>
					</view>
				</view>
				<view :style='{"padding":"0 20rpx 0 10rpx","alignItems":"center","top":"60rpx","borderRadius":"40rpx 0 0 40rpx","background":"none","flexDirection":"column","display":"flex","width":"120rpx","position":"absolute","right":"0px","justifyContent":"center","height":"auto"}' class="setting">
					<text class="icon iconfont icon-qita6" :style='{"border":"0","margin":"0 10rpx 0 0","color":"#333","borderRadius":"0","width":"40rpx","lineHeight":"40rpx","fontSize":"48rpx","fontWeight":"500"}'></text>
					<text :style='{"color":"#333","lineHeight":"60rpx","fontSize":"32rpx"}'>设置</text>
				</view>
			</view>
			
			<view v-else :style='{"minHeight":"auto","padding":"0px 24rpx","margin":"0 0 20rpx 0","borderRadius":"0","background":"none","display":"flex","width":"100%","position":"unset","height":"auto"}' @tap="loginClick" class="header" v-bind:class="{'status':isH5Plus}">
				<view :style='{"alignItems":"center","color":"#333","background":"none","display":"flex","width":"100%","fontSize":"36rpx","justifyContent":"center","height":"300rpx"}'>登录/注册</view>
			</view>
			
			<view :style='{"width":"100%","background":"none","height":"auto"}' class="list">
				
				<view :style='{"width":"calc(100% - 48rpx)","padding":"0px 0 0","margin":"40rpx auto","borderRadius":"20rpx","background":"none","height":"auto"}'>
					<view :style='{"padding":"0 0 0 80rpx","margin":"0 0 40rpx","borderColor":"#23baf7","color":"#000","textAlign":"left","display":"none","background":"url(http://codegen.caihongy.cn/20241110/8dff7d1201304c20b53f3530844a8261.png) no-repeat left center","borderWidth":"0 0 0 0px","width":"100%","fontSize":"44rpx","position":"relative","borderStyle":"solid","fontWeight":"600"}'>
						<view :style='{"color":"#000","fontSize":"44rpx"}'>我的服务</view>
					</view>
					<view class="me-menu-view">
						<block v-for="item in menuList" v-bind:key="item.roleName">
							<block v-if="role==item.roleName" v-bind:key="menu.menu" v-for="(menu,index) in item.backMenu">
								<block v-bind:key="child.tableName" v-for=" (child,sort) in menu.child">
									<view class="me-menu-item" v-if="child.tableName!='orders/已发货' && child.tableName!='orders/已退款' &&child.tableName!='orders/已取消' && child.tableName!='orders/未支付' && child.tableName!='orders/已支付' && child.tableName!='orders/已完成' && child.tableName!='exampaper' && child.tableName!='examquestion'&& child.tableName!='hasTranslate' " @tap="onPageTap('../'+child.tableName+'/list?userid='+user.id+'&menuJump='+child.menuJump)" hover-class="hover">
										<view class="me-menu-icon" :class="child.appFrontIcon" :style="{'color': meMenuColor[index]}"></view>
										<view class="text">{{child.menu}}</view>
										<view class="icon iconfont icon-jinru"></view>
									</view>
								</block>
							</block>
						</block>


						<view v-if="user&&user.id" @tap="onPageTap('../chat/chat')" class="me-menu-item" hover-class="hover">
							<view class="cuIcon-service me-menu-icon" :style="{'color': meMenuColor[3]}"></view>
							<view class="text">智能AI</view>
							<view class="icon iconfont icon-jinru"></view>
						</view>
						<view v-if="user&&user.id" @tap="onPageTap('../forum-my/forum-my')" class="me-menu-item" hover-class="hover">
							<view class="cuIcon-scan me-menu-icon" :style="{'color': meMenuColor[5]}"></view>
							<view class="text">我的发贴</view>
							<view class="icon iconfont icon-jinru"></view>
						</view>
						<view v-if="user&&user.id" @tap="passwordShow()" class="me-menu-item" hover-class="hover">
							<view class="cuIcon-lock me-menu-icon" :style="{'color': meMenuColor[6]}"></view>
							<view class="text">修改密码</view>
							<view class="icon iconfont icon-jinru"></view>
						</view>
					</view>
				</view>
			</view>
			
			<!-- 推荐 -->
			<view class="recommend" :style='{"border":"2rpx solid #feca97","padding":"24rpx 24rpx","margin":"40rpx auto 0","borderRadius":"20rpx","background":"url(http://codegen.caihongy.cn/20241114/20a81e731b3148ddbcd34ff49c5b9450.png) no-repeat right top / 100% auto,linear-gradient(180deg, rgba(255,232,211,1) 0%, rgba(255,188,109,1) 100%)","width":"calc(100% - 48rpx)","order":"1"}' v-if="recommendList.length">
				<view :style='{"padding":"0 0 0 0px","margin":"0 0 40rpx","borderColor":"#23baf7","color":"#fa861c","textAlign":"left","background":"none","borderWidth":"0 0 0 0px","width":"100%","fontSize":"44rpx","position":"relative","borderStyle":"solid","fontWeight":"600"}'>热门信息</view>
				<view :style='{"padding":"0","borderRadius":"20rpx","flexWrap":"wrap","background":"none","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
					<view v-for="(item,index) in recommendList" :key="index" :style='{"padding":"20rpx","margin":"0 0 40rpx","color":"#999","borderRadius":"20rpx","flexWrap":"wrap","background":"#fff","display":"block","width":"100%","fontSize":"28rpx","justifyContent":"space-between","height":"auto"}' @click="recommendDetail(item.id)">
						<image v-if="preHttp(item[recommendPicture])" :style='{"margin":"0 20rpx 0 -20rpx","borderColor":"#fa861c","objectFit":"cover","borderRadius":"0 20rpx 20rpx 0","borderWidth":"4rpx 4rpx 4rpx 0","display":"block","width":"240rpx","borderStyle":"solid","float":"left","height":"200rpx"}' :src="item[recommendPicture]"></image>
						<image v-else :style='{"margin":"0 20rpx 0 -20rpx","borderColor":"#fa861c","objectFit":"cover","borderRadius":"0 20rpx 20rpx 0","borderWidth":"4rpx 4rpx 4rpx 0","display":"block","width":"240rpx","borderStyle":"solid","float":"left","height":"200rpx"}' :src="item[recommendPicture]?(baseUrl + item[recommendPicture].split(',')[0]):''"></image>
						<view :style='{"padding":"0 0px","overflow":"hidden","whiteSpace":"nowrap","color":"#333","width":"calc(100% - 240rpx)","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis","float":"right"}'>{{item[recommendTitle]}}</view>
						<view :style='{"padding":"0 0 0 44rpx","margin":"0 20rpx 0 0","color":"#999","textAlign":"left","background":"url(http://codegen.caihongy.cn/20241116/a296ecedfd1e412187b9d787f8ffc953.png) no-repeat left center / 32rpx","width":"calc(100% - 260rpx)","lineHeight":"48rpx","fontSize":"28rpx","float":"right"}'>{{item.addtime}}</view>
					</view>
				</view>
			</view>
			<view style="width: 100%;height: 80px"></view>
		</view>
		<uni-popup class="popup-content" ref="passwordPopup" type="bottom">
			<view class="passwordForm">
				<view class="passwordInput">
					<input type="password" v-model="passwordForm.mima" placeholder="原密码" />
				</view>
				<view class="passwordInput">
					<input type="password" v-model="passwordForm.newmima" placeholder="新密码" />
				</view>
				<view class="passwordInput">
					<input type="password" v-model="passwordForm.newmima1" placeholder="确认密码" />
				</view>
				<view class="passwordBtnView">
					<button class="passwordBtn" @click="updatePassword">更新</button>
				</view>
			</view>
		</uni-popup>
	</view>
</template>
<script>
	import menu from '@/utils/menu'
	export default {
		data() {
			return {
				isH5Plus: true,
				user: {},
				tableName:'',
				role: '',
				menuList: [],
				iconArr: [
					'cuIcon-same',
					'cuIcon-deliver',
					'cuIcon-evaluate',
					'cuIcon-shop',
					'cuIcon-ticket',
					'cuIcon-cascades',
					'cuIcon-discover',
					'cuIcon-question',
					'cuIcon-pic',
					'cuIcon-filter',
					'cuIcon-footprint',
					'cuIcon-pulldown',
					'cuIcon-pullup',
					'cuIcon-moreandroid',
					'cuIcon-refund',
					'cuIcon-qrcode',
					'cuIcon-remind',
					'cuIcon-profile',
					'cuIcon-home',
					'cuIcon-message',
					'cuIcon-link',
					'cuIcon-lock',
					'cuIcon-unlock',
					'cuIcon-vip',
					'cuIcon-weibo',
					'cuIcon-activity',
					'cuIcon-friendadd',
					'cuIcon-friendfamous',
					'cuIcon-friend',
					'cuIcon-goods',
					'cuIcon-selection'
				],
				recommendList: [],
				recommendTable: '',
				recommendTitle: '',
				recommendPicture: '',
				passwordForm: {
					mima: '',
					newmima: '',
					newmima1: '',
				},
				meMenuColor: '#1ccb96,#75b2fd,#fee232,#1ccb96,#75b2fd,#fee232,#351c6c,#f093a9,#a7c23a,#104eff,#10441f,#a21233,#503319'.split(',')
			};
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
		},
		async onLoad(){
			let menus = menu.list();
			this.menuList = menus;
			this.meMenuColor = this.meMenuColor.sort(()=> {
				return (0.5-Math.random());
			});
		},
		async onShow(){
            uni.removeStorageSync("useridTag");
			this.role = uni.getStorageSync("appRole");
			await this.getSession()
			this.getThumbsup()
			this.getStoreup()
			this.tableName = uni.getStorageSync("nowTable");
			let menus = menu.list();
			this.menuList = menus;
			this.getRecommendList()
			this.$forceUpdate()
		},
		methods: {
			async getSession(){
				let table = uni.getStorageSync("nowTable");
				let res = await this.$api.session(table);
				this.user = res.data;
				this.$forceUpdate()
			},
			async getThumbsup(){
				if(!this.user||!this.user.id){
					return false
				}
				let res = await this.$api.page('storeup',{userid: this.user.id,type: 21})
				this.user.thumbsnum = Number(res.data.total)
				this.$forceUpdate()
			},
			async getStoreup(){
				if(!this.user||!this.user.id){
					return false
				}
				let res = await this.$api.page('storeup',{userid: this.user.id,type: 1})
				this.user.storenum = Number(res.data.total)
				this.$forceUpdate()
			},
			loginClick(){
				uni.navigateTo({
					url: '../login/login'
				});
			},
			onPageTap(url) {
                uni.setStorageSync("useridTag",1);
				uni.navigateTo({
					url: url,
					fail: function() {
						uni.switchTab({
							url: url
						});
					}
				});
			},
			hasTranslate(){
				for(let x in this.menuList){
					if(this.menuList[x].roleName == this.role){
						for(let i in this.menuList[x].backMenu){
							if(this.menuList[x].backMenu[i].child.length) {
								for(let j in this.menuList[x].backMenu[i].child) {
									if(this.menuList[x].backMenu[i].child[j].tableName=='hasTranslate'){
										return true
									}
								}
							}
						}
					}
				}
				return false
			},
			
			preHttp(str) {
			    return str && str.substr(0,4)=='http';
			},
			async getRecommendList(){
				let params = {
					page: 1,
					limit: 2
				}
				let res;
				if(uni.getStorageSync("appUserid")) {
					res = await this.$api.recommend2('jiankangshipu', params);
				} else {
					res = await this.$api.recommend('jiankangshipu', params);
				}
				this.recommendList = res.data.list
				this.recommendTable = 'jiankangshipu'
				this.recommendTitle = 'shipumingcheng'
				this.recommendPicture = 'tupian'
				this.$forceUpdate()
			},
			recommendDetail(id) {
				uni.navigateTo({
					url: `../${this.recommendTable}/detail?id=${id}`,
					fail: function() {
						uni.switchTab({
							url: `../${this.recommendTable}/detail?id=${id}`
						});
					}
				});
			},
			passwordShow() {
				this.passwordForm = {
					mima: '',
					newmima: '',
					newmima1: '',
				}
				this.$forceUpdate()
				this.$refs.passwordPopup.open()
			},
			async updatePassword() {
				if (this.passwordForm.mima == ''){
					this.$utils.msg('原密码不能为空')
					return false
				}
				if (this.passwordForm.newmima == ''){
					this.$utils.msg('新密码不能为空')
					return false
				}
				if (this.passwordForm.newmima1 == ''){
					this.$utils.msg('确认密码不能为空')
					return false
				}
				let password = ''
				if (this.user.mima) {
					password = this.user.mima;
				} else if (this.user.password) {
					password = this.user.password;
				}
				if (this.tableName == 'yonghu') {
				}
				let newpassword = this.passwordForm.mima
				if(password != newpassword){
					this.$utils.msg('原密码不正确')
					return false
				}
				if (this.passwordForm.newmima != this.passwordForm.newmima1){
					this.$utils.msg('两次密码不一致')
					return false
				}
				if (this.passwordForm.mima == this.passwordForm.newmima){
					this.$utils.msg('新密码与原密码相同！')
					return false
				}
				this.user.password = this.passwordForm.newmima
				this.user.mima = this.passwordForm.newmima
				await this.$api.update(this.tableName,this.user)
				this.$utils.msg('修改密码成功,下次登录系统生效')
				this.$refs.passwordPopup.close()
				this.getSession()
			},
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		height: calc(100vh - 94px);
		box-sizing: border-box;
	}
	.passwordForm {
		width: 100%;
		padding: 10px 20px 60px;
		background: #fff;
	
		.passwordInput {
			background: #eee;
			margin: 0 0 10px;
			padding: 0 10px;
	
			input {
				height: 36px;
				line-height: 36px;
				font-size: 14px;
			}
		}
	
		.passwordBtnView {
			width: 100%;
			display: flex;
			align-items: center;
			justify-content: center;
			padding: 10px 0;
	
			.passwordBtn {
				padding: 0 20px;
				width: auto;
				height: 20px;
				line-height: 20px;
				font-size: 14px;
				color: #fff;
				background: #007aff;
				border: none;
				border-radius: 5px;
	
			}
		}
	}
	.me-menu-view {
		padding: 0;
		align-content: flex-start;
		background: none;
		display: flex;
		width: 100%;
		justify-content: space-between;
		align-items: flex-start;
		flex-wrap: wrap;
		height: auto;
		.me-menu-item {
			padding: 20rpx;
			margin: 0 0 30rpx;
			display: flex;
			border-color: #f3f5f9;
			border-radius: 20rpx;
			flex-direction: row;
			background: #fff;
			width: calc(48% - 0px);
			border-width: 0 0 0px;
			align-items: center;
			position: relative;
			border-style: solid;
			height: auto;
			.me-menu-icon {
				color: rgba(0, 186, 189, 1);
				font-size: 48rpx;
				line-height: 1;
			}
			.text {
				padding: 0 10rpx;
				color: #333;
				width: 100%;
				font-size: 28rpx;
				line-height: 60rpx;
				text-align: left;
			}
			.icon {
				color: #c5c5c5;
				top: 35%;
				font-weight: 600;
				width: 28rpx;
				font-size: 28rpx;
				line-height: 28rpx;
				position: absolute;
				right: 20rpx;
			}
		}
	}
</style>
