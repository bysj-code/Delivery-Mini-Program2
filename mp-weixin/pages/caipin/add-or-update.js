(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/caipin/add-or-update"],{"05c3":function(e,n,i){"use strict";var t=i("e10d"),a=i.n(t);a.a},2047:function(e,n,i){"use strict";(function(e){i("48e8");t(i("66fd"));var n=t(i("44fd"));function t(e){return e&&e.__esModule?e:{default:e}}wx.__webpack_require_UNI_MP_PLUGIN__=i,e(n.default)}).call(this,i("543d")["createPage"])},"44fd":function(e,n,i){"use strict";i.r(n);var t=i("b52c"),a=i("9a7d");for(var r in a)"default"!==r&&function(e){i.d(n,e,(function(){return a[e]}))}(r);i("05c3");var u,c=i("f0c5"),o=Object(c["a"])(a["default"],t["b"],t["c"],!1,null,"5585e377",null,!1,t["a"],u);n["default"]=o.exports},"9a7d":function(e,n,i){"use strict";i.r(n);var t=i("d537"),a=i.n(t);for(var r in t)"default"!==r&&function(e){i.d(n,e,(function(){return t[e]}))}(r);n["default"]=a.a},b52c:function(e,n,i){"use strict";i.d(n,"b",(function(){return a})),i.d(n,"c",(function(){return r})),i.d(n,"a",(function(){return t}));var t={wPicker:function(){return Promise.all([i.e("common/vendor"),i.e("components/w-picker/w-picker")]).then(i.bind(null,"b7aa"))}},a=function(){var e=this,n=e.$createElement;e._self._c},r=[]},d537:function(e,n,i){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var t=a(i("a34a"));function a(e){return e&&e.__esModule?e:{default:e}}function r(e,n,i,t,a,r,u){try{var c=e[r](u),o=c.value}catch(s){return void i(s)}c.done?n(o):Promise.resolve(o).then(t,a)}function u(e){return function(){var n=this,i=arguments;return new Promise((function(t,a){var u=e.apply(n,i);function c(e){r(u,t,a,c,o,"next",e)}function o(e){r(u,t,a,c,o,"throw",e)}c(void 0)}))}}var c=function(){Promise.all([i.e("common/vendor"),i.e("components/w-picker/w-picker")]).then(function(){return resolve(i("b7aa"))}.bind(null,i)).catch(i.oe)},o={data:function(){return{cross:"",ro:{caipinUuidNumber:!0,caipinName:!1,caipinPhoto:!1,caipinTypes:!1,caipinKucunNumber:!1,caipinPrice:!1,caipinOldMoney:!1,caipinNewMoney:!1,caipinClicknum:!1,caipinContent:!1,shangxiaTypes:!1,caipinDelete:!1,createTime:!1},ruleForm:{caipinUuidNumber:this.getUUID(),caipinName:"",caipinPhoto:"",caipinTypes:"",caipinValue:"",caipinKucunNumber:"",caipinPrice:"",caipinOldMoney:"",caipinNewMoney:"",caipinClicknum:"",caipinContent:"",shangxiaTypes:"",shangxiaValue:"",caipinDelete:"",createTime:""},user:{},caipinTypesOptions:[],caipinTypesIndex:0,shangxiaTypesOptions:[],shangxiaTypesIndex:0}},components:{wPicker:c},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(e){var n=this;return u(t.default.mark((function i(){var a,r,u,c,o;return t.default.wrap((function(i){while(1)switch(i.prev=i.next){case 0:return a={page:1,limit:100,dicCode:"caipin_types"},i.next=3,n.$api.page("dictionary",a);case 3:return r=i.sent,n.caipinTypesOptions=r.data.list,u={page:1,limit:100,dicCode:"shangxia_types"},i.next=8,n.$api.page("dictionary",u);case 8:if(c=i.sent,n.shangxiaTypesOptions=c.data.list,!e.id){i.next=16;break}return n.ruleForm.id=e.id,i.next=14,n.$api.info("caipin",n.ruleForm.id);case 14:o=i.sent,n.ruleForm=o.data;case 16:e.caipinId&&(n.ruleForm.caipinId=e.caipinId);case 17:case"end":return i.stop()}}),i)})))()},methods:{caipinTypesChange:function(e){this.caipinTypesIndex=e.target.value,this.ruleForm.caipinValue=this.caipinTypesOptions[this.caipinTypesIndex].indexName,this.ruleForm.caipinTypes=this.caipinTypesOptions[this.caipinTypesIndex].codeIndex},shangxiaTypesChange:function(e){this.shangxiaTypesIndex=e.target.value,this.ruleForm.shangxiaValue=this.shangxiaTypesOptions[this.shangxiaTypesIndex].indexName,this.ruleForm.shangxiaTypes=this.shangxiaTypesOptions[this.shangxiaTypesIndex].codeIndex},caipinPhotoTap:function(){var e=this;this.$api.upload((function(n){e.ruleForm.caipinPhoto=e.$base.url+"upload/"+n.file,e.$forceUpdate(),e.$nextTick((function(){}))}))},createTimeConfirm:function(e){console.log(e),this.ruleForm.createTime=e.result,this.$forceUpdate()},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var n=this;return u(t.default.mark((function i(){return t.default.wrap((function(i){while(1)switch(i.prev=i.next){case 0:if(n.ruleForm.caipinUuidNumber){i.next=3;break}return n.$utils.msg("菜品编号不能为空"),i.abrupt("return");case 3:if(n.ruleForm.caipinName){i.next=6;break}return n.$utils.msg("菜品名称不能为空"),i.abrupt("return");case 6:if(n.ruleForm.caipinPhoto){i.next=9;break}return n.$utils.msg("菜品照片不能为空"),i.abrupt("return");case 9:if(n.ruleForm.caipinKucunNumber||n.$validate.isIntNumer(n.ruleForm.caipinKucunNumber)||!(n.ruleForm.caipinKucunNumber>0)){i.next=12;break}return n.$utils.msg("菜品库存不能为空，不能小于0 格式为数字"),i.abrupt("return");case 12:if(n.ruleForm.caipinPrice||n.$validate.isIntNumer(n.ruleForm.caipinPrice)||!(n.ruleForm.caipinPrice>0)){i.next=15;break}return n.$utils.msg("购买获得积分不能为空，不能小于0 格式为数字"),i.abrupt("return");case 15:if(n.ruleForm.caipinClicknum||n.$validate.isIntNumer(n.ruleForm.caipinClicknum)||!(n.ruleForm.caipinClicknum>0)){i.next=18;break}return n.$utils.msg("点击次数不能为空，不能小于0 格式为数字"),i.abrupt("return");case 18:if(!n.ruleForm.id){i.next=23;break}return i.next=21,n.$api.update("caipin",n.ruleForm);case 21:i.next=25;break;case 23:return i.next=25,n.$api.save("caipin",n.ruleForm);case 25:e.setStorageSync("pingluenStateState",!0),n.$utils.msgBack("提交成功");case 27:case"end":return i.stop()}}),i)})))()},getDate:function(e){var n=new Date,i=n.getFullYear(),t=n.getMonth()+1,a=n.getDate();return"start"===e?i-=60:"end"===e&&(i+=2),t=t>9?t:"0"+t,a=a>9?a:"0"+a,"".concat(i,"-").concat(t,"-").concat(a)},toggleTab:function(e){this.$refs[e].show()}}};n.default=o}).call(this,i("543d")["default"])},e10d:function(e,n,i){}},[["2047","common/runtime","common/vendor"]]]);