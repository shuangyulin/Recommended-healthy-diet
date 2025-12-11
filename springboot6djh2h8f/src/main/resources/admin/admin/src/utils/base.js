const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot6djh2h8f/",
            name: "springboot6djh2h8f",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot6djh2h8f/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于Android开发的健康饮食推荐系统"
        } 
    }
}
export default base
