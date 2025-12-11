<template>
<view class="content">
	<view :style='{"minHeight":"100vh","width":"100%","padding":"24rpx","position":"relative","background":"#fff3e8","height":"auto"}'>
		<form :style='{"width":"100%","padding":"48rpx 0 48rpx","background":"none","display":"block","height":"auto"}' class="app-update-pv">
			<view :style='{"padding":"4rpx 40rpx","margin":"0 0 40rpx 0","borderColor":"#dfdfdf","alignItems":"center","borderRadius":"0px","borderWidth":"0px 0 2rpx 0","background":"none","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#666","textAlign":"right","width":"160rpx","lineHeight":"80rpx","fontSize":"30rpx","fontWeight":"500"}' class="title">账号</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"30rpx","height":"80rpx"}' :disabled="ro.zhanghao" v-model="ruleForm.zhanghao" placeholder="账号"  type="text"></input>
			</view>
			<view :style='{"padding":"4rpx 40rpx","margin":"0 0 40rpx 0","borderColor":"#dfdfdf","alignItems":"center","borderRadius":"0px","borderWidth":"0px 0 2rpx 0","background":"none","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#666","textAlign":"right","width":"160rpx","lineHeight":"80rpx","fontSize":"30rpx","fontWeight":"500"}' class="title">姓名</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"30rpx","height":"80rpx"}' :disabled="ro.xingming" v-model="ruleForm.xingming" placeholder="姓名"  type="text"></input>
			</view>
			<view :style='{"padding":"4rpx 40rpx","margin":"0 0 40rpx 0","borderColor":"#dfdfdf","alignItems":"center","borderRadius":"0px","borderWidth":"0px 0 2rpx 0","background":"none","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#666","textAlign":"right","width":"160rpx","lineHeight":"80rpx","fontSize":"30rpx","fontWeight":"500"}' class="title">年龄</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"30rpx","height":"80rpx"}' :disabled="ro.nianling" v-model="ruleForm.nianling" placeholder="年龄"  type="text"></input>
			</view>
			<view :style='{"padding":"4rpx 40rpx","margin":"0 0 40rpx 0","borderColor":"#dfdfdf","alignItems":"center","borderRadius":"0px","borderWidth":"0px 0 2rpx 0","background":"none","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#666","textAlign":"right","width":"160rpx","lineHeight":"80rpx","fontSize":"30rpx","fontWeight":"500"}' class="title">身高(cm)</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"30rpx","height":"80rpx"}' :disabled="ro.shengao" v-model.number="ruleForm.shengao" placeholder="身高(cm)" type="digit"></input>
			</view>
			<view :style='{"padding":"4rpx 40rpx","margin":"0 0 40rpx 0","borderColor":"#dfdfdf","alignItems":"center","borderRadius":"0px","borderWidth":"0px 0 2rpx 0","background":"none","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#666","textAlign":"right","width":"160rpx","lineHeight":"80rpx","fontSize":"30rpx","fontWeight":"500"}' class="title">体重(kg)</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"30rpx","height":"80rpx"}' :disabled="ro.tizhong" v-model.number="ruleForm.tizhong" placeholder="体重(kg)" type="digit"></input>
			</view>
			<view :style='{"padding":"4rpx 40rpx","margin":"0 0 40rpx 0","borderColor":"#dfdfdf","alignItems":"center","borderRadius":"0px","borderWidth":"0px 0 2rpx 0","background":"none","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#666","textAlign":"right","width":"160rpx","lineHeight":"80rpx","fontSize":"30rpx","fontWeight":"500"}' class="title">心率(次/分钟)</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"30rpx","height":"80rpx"}' :disabled="ro.xinlv" v-model.number="ruleForm.xinlv" placeholder="心率(次/分钟)" type="digit"></input>
			</view>
			<view :style='{"padding":"4rpx 40rpx","margin":"0 0 40rpx 0","borderColor":"#dfdfdf","alignItems":"center","borderRadius":"0px","borderWidth":"0px 0 2rpx 0","background":"none","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#666","textAlign":"right","width":"160rpx","lineHeight":"80rpx","fontSize":"30rpx","fontWeight":"500"}' class="title">血压(mmHg)</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"30rpx","height":"80rpx"}' :disabled="ro.xueya" v-model.number="ruleForm.xueya" placeholder="血压(mmHg)" type="digit"></input>
			</view>
			<view :style='{"padding":"4rpx 40rpx","margin":"0 0 40rpx 0","borderColor":"#dfdfdf","alignItems":"center","borderRadius":"0px","borderWidth":"0px 0 2rpx 0","background":"none","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#666","textAlign":"right","width":"160rpx","lineHeight":"80rpx","fontSize":"30rpx","fontWeight":"500"}' class="title">体脂率</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"30rpx","height":"80rpx"}' :disabled="ro.tizhilv" v-model.number="ruleForm.tizhilv" placeholder="体脂率" type="digit"></input>
			</view>
			<view :style='{"padding":"4rpx 40rpx","margin":"0 0 40rpx 0","borderColor":"#dfdfdf","alignItems":"center","borderRadius":"0px","borderWidth":"0px 0 2rpx 0","background":"none","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#666","textAlign":"right","width":"160rpx","lineHeight":"80rpx","fontSize":"30rpx","fontWeight":"500"}' class="title">血糖(mmHg)</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"30rpx","height":"80rpx"}' :disabled="ro.xuetang" v-model.number="ruleForm.xuetang" placeholder="血糖(mmHg)" type="digit"></input>
			</view>
			<view :style='{"padding":"4rpx 40rpx","margin":"0 0 40rpx 0","borderColor":"#dfdfdf","alignItems":"center","borderRadius":"0px","borderWidth":"0px 0 2rpx 0","background":"none","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"padding":"0 20rpx 0 0","color":"#666","textAlign":"right","width":"160rpx","lineHeight":"80rpx","fontSize":"30rpx","fontWeight":"500"}' class="title">日期</view>
				<picker  :disabled="ro.riqi" :style='{"width":"100%","flex":"1","height":"auto"}' mode="date" :value="ruleForm.riqi" @change="riqiChange">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"30rpx","color":"#fa861c"}' class="uni-input">{{ruleForm.riqi?ruleForm.riqi:"请选择日期"}}</view>
				</picker>
			</view>
          
			
			<view :style='{"width":"100%","margin":"40rpx 0","flexDirection":"column","justifyContent":"center","display":"flex","height":"auto"}' class="btn" >
				<button :style='{"border":"0","padding":"0","margin":"0 0 40rpx 0","color":"rgb(255, 255, 255)","borderRadius":"16rpx","background":"#fa861c","width":"100%","lineHeight":"96rpx","fontSize":"30rpx","height":"96rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

	</view>
</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";
	import xiaEditor from '@/components/xia-editor/xia-editor';
	import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
				cross:'',
				ruleForm: {
				zhanghao: '',
				xingming: '',
				nianling: '',
				shengao: '',
				tizhong: '',
				xinlv: '',
				xueya: '',
				tizhilv: '',
				xuetang: '',
				riqi: '',
				},
				// 登录用户信息
				user: {},
				ro:{
				   zhanghao : false,
				   xingming : false,
				   nianling : false,
				   shengao : false,
				   tizhong : false,
				   xinlv : false,
				   xueya : false,
				   tizhilv : false,
				   xuetang : false,
				   riqi : false,
				},
				virtualPay: false,
			}
		},
		components: {
			wPicker,
			xiaEditor,
			multipleSelect,
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},



		},
		async onLoad(options) {
			if(options.virtualPay){
				this.virtualPay = true
			}
			this.ruleForm.riqi = this.$utils.getCurDate();
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取
			this.ruleForm.zhanghao = this.user.zhanghao
			this.ro.zhanghao = true;
			this.ruleForm.xingming = this.user.xingming
			this.ro.xingming = true;



			// 如果有登录，获取登录后保存的userid
			this.ruleForm.userid = uni.getStorageSync("appUserid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = Number(options.refid);
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`jiankangshuju`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='zhanghao'){
						this.ruleForm.zhanghao = obj[o];
						this.ro.zhanghao = true;
						continue;
					}
					if(o=='xingming'){
						this.ruleForm.xingming = obj[o];
						this.ro.xingming = true;
						continue;
					}
					if(o=='nianling'){
						this.ruleForm.nianling = obj[o];
						this.ro.nianling = true;
						continue;
					}
					if(o=='shengao'){
						this.ruleForm.shengao = obj[o];
						this.ro.shengao = true;
						continue;
					}
					if(o=='tizhong'){
						this.ruleForm.tizhong = obj[o];
						this.ro.tizhong = true;
						continue;
					}
					if(o=='xinlv'){
						this.ruleForm.xinlv = obj[o];
						this.ro.xinlv = true;
						continue;
					}
					if(o=='xueya'){
						this.ruleForm.xueya = obj[o];
						this.ro.xueya = true;
						continue;
					}
					if(o=='tizhilv'){
						this.ruleForm.tizhilv = obj[o];
						this.ro.tizhilv = true;
						continue;
					}
					if(o=='xuetang'){
						this.ruleForm.xuetang = obj[o];
						this.ro.xuetang = true;
						continue;
					}
					if(o=='riqi'){
						this.ruleForm.riqi = obj[o];
						this.ro.riqi = true;
						continue;
					}
				}
			}
			this.styleChange()
			this.$forceUpdate()
			if (uni.getStorageSync('raffleType') && uni.getStorageSync('raffleType') != null) {
				uni.removeStorageSync('raffleType')
				setTimeout(() => {
					this.onSubmitTap()
				}, 300)
			}
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv . .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},

			// 多级联动参数

			riqiChange(e) {
				this.ruleForm.riqi = e.target.value;
				this.$forceUpdate();
			},




			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
				let that = this
				//跨表计算判断
				var obj;
				if((!this.ruleForm.zhanghao)){
					this.$utils.msg(`账号不能为空`);
					return
				}
				if((!this.ruleForm.nianling)){
					this.$utils.msg(`年龄不能为空`);
					return
				}
				if((!this.ruleForm.shengao)){
					this.$utils.msg(`身高(cm)不能为空`);
					return
				}
				if(this.ruleForm.shengao&&(!this.$validate.isNumber(this.ruleForm.shengao))){
					this.$utils.msg(`身高(cm)应输入数字`);
					return
				}
				if((!this.ruleForm.tizhong)){
					this.$utils.msg(`体重(kg)不能为空`);
					return
				}
				if(this.ruleForm.tizhong&&(!this.$validate.isNumber(this.ruleForm.tizhong))){
					this.$utils.msg(`体重(kg)应输入数字`);
					return
				}
				if((!this.ruleForm.xinlv)){
					this.$utils.msg(`心率(次/分钟)不能为空`);
					return
				}
				if(this.ruleForm.xinlv&&(!this.$validate.isNumber(this.ruleForm.xinlv))){
					this.$utils.msg(`心率(次/分钟)应输入数字`);
					return
				}
				if((!this.ruleForm.xueya)){
					this.$utils.msg(`血压(mmHg)不能为空`);
					return
				}
				if(this.ruleForm.xueya&&(!this.$validate.isNumber(this.ruleForm.xueya))){
					this.$utils.msg(`血压(mmHg)应输入数字`);
					return
				}
				if((!this.ruleForm.tizhilv)){
					this.$utils.msg(`体脂率不能为空`);
					return
				}
				if(this.ruleForm.tizhilv&&(!this.$validate.isNumber(this.ruleForm.tizhilv))){
					this.$utils.msg(`体脂率应输入数字`);
					return
				}
				if((!this.ruleForm.xuetang)){
					this.$utils.msg(`血糖(mmHg)不能为空`);
					return
				}
				if(this.ruleForm.xuetang&&(!this.$validate.isNumber(this.ruleForm.xuetang))){
					this.$utils.msg(`血糖(mmHg)应输入数字`);
					return
				}
				//更新跨表属性
				var crossuserid;
				var crossrefid;
				var crossoptnum;
				if(this.cross){
					var statusColumnName = uni.getStorageSync('statusColumnName');
					var statusColumnValue = uni.getStorageSync('statusColumnValue');
					if(statusColumnName!='') {
						if(!obj) {
							obj = uni.getStorageSync('crossObj');
						}
						if(!statusColumnName.startsWith("[")) {
							for (var o in obj){
								if(o==statusColumnName){
									obj[o] = statusColumnValue;
								}

							}
							var table = uni.getStorageSync('crossTable');
							await this.$api.update(`${table}`, obj);
						} else {
							   crossuserid=Number(uni.getStorageSync('appUserid'));
							   crossrefid=obj['id'];
							   crossoptnum=uni.getStorageSync('statusColumnName');
							   crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
						}
					}
				}
				if(crossrefid && crossuserid) {
					this.ruleForm.crossuserid=crossuserid;
					this.ruleForm.crossrefid=crossrefid;
					let params = {
						page: 1,
						limit:10,
						crossuserid:crossuserid,
						crossrefid:crossrefid,
					}
					let res = await this.$api.list(`jiankangshuju`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
						uni.removeStorageSync('crossCleanType');
						return false;
					} else {
				//跨表计算
						let oet = {}
						if(this.ruleForm.id){
							await this.$api.update(`jiankangshuju`, this.ruleForm);
						}else{
							oet = await this.$api.add(`jiankangshuju`, this.ruleForm);
						}
						if(this.cross){
							uni.setStorageSync('crossCleanType',true);
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
				//跨表计算
					let oet = {}
					if(this.ruleForm.id){
						await this.$api.update(`jiankangshuju`, this.ruleForm);
					}else{
						oet = await this.$api.add(`jiankangshuju`, this.ruleForm);
					}
					if(this.cross){
						uni.setStorageSync('crossCleanType',true);
					}
					this.$utils.msgBack('提交成功');
				}
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				if(this.ro[str]){
					return false
				}
				this.$refs[str].show();
			},
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
