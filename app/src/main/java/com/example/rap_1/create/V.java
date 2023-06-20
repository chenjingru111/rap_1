package com.example.rap_1.create;

import java.util.ArrayList;
import java.util.Random;

public class V {
    public static String getV(){
        ArrayList<String> countryNames  = new ArrayList<>();
        String[] countries={"爱", "观看", "购买", "打", "跑", "走", "唱", "看", "听", "写", "做", "画", "玩", "思考", "吃", "喝", "睡", "起床", "洗澡", "穿衣服", "刷牙", "洗碗", "打扫", "打篮球", "踢足球", "游泳", "跳舞", "看电影", "上网", "旅行", "散步", "拜访", "发送", "接收", "下载", "上传", "分享", "维修", "组装", "安装", "排列", "测量", "计算", "推销", "谈判", "交流", "协作", "合作", "开会", "签订", "批准", "审批", "监督", "管理", "指导", "培训", "演示", "展示", "推广", "发表", "撰写", "编辑", "翻译", "讲解", "说明", "介绍", "宣传", "鼓励", "解释", "支持", "反对", "抵制", "投票", "竞选", "当选", "复制", "粘贴", "删除", "保存", "备份", "恢复", "打印", "扫描", "拍照", "录音", "录像", "剪辑", "传真", "输入", "输出", "搜索", "浏览", "评论", "评价", "评估", "调查", "分析", "测试", "检验", "验证", "系统化", "分类", "归纳", "推理", "预测", "创新", "发明", "发现", "改进", "优化", "叙述", "解说", "解答", "问候", "道谢", "道别", "祝贺", "悔过", "赞美", "鼓掌", "期望", "建议", "催促", "邀请", "约会", "庆祝", "关怀", "照顾", "帮助", "支援", "安慰", "鼓舞", "呼吁", "保护", "环保", "节能", "减少", "清理", "消毒", "整理", "包装", "运输", "储存", "收集", "回收", "销售", "交易", "支付", "结算", "退款", "投资", "理财", "贷款", "借款", "赚取", "节约", "投保", "索赔", "修理", "维护", "保养", "更新", "升级", "换装", "更换", "修缮", "折叠", "挂起", "悬挂", "压制", "刹车", "加速", "调整", "校准", "匹配", "安排", "预约", "约定", "延期", "推迟", "取消", "停止", "暂停", "重启", "加入", "退出", "异常", "故障", "终止", "协调", "沟通", "咨询", "寻找", "招聘", "录用", "辞职", "开除", "复职", "实习", "培训", "考核", "晋升", "调动", "离职", "退休", "回家", "出发", "旅游", "度假", "采购", "进货", "销售", "促销", "营销", "推广", "竞争", "创业", "扩张", "兼并", "并购", "重组", "上市", "发行","交换", "交错", "交卷", "估价", "儿童化", "像模像样", "充电", "养生", "关机", "再见", "写真", "加工", "办公", "化妆", "变脸", "发射", "发表演讲", "口吃", "合唱", "哄骗", "喜欢", "喧闹", "嘲笑", "回忆", "地震", "堵塞", "复原", "失眠", "头晕", "奉献", "委托", "学习", "学英文", "寄存", "察看", "对付", "履行", "巡回", "干预", "引入", "归还", "忍辱", "怒斥", "悔改", "想象", "懊悔", "打瞌睡", "抱怨", "拌嘴", "拔河", "招待", "插手", "改悔", "教制", "旋律", "昏厥", "晕车", "朝鲜", "机场", "杀人", "染色", "核对", "桥牌", "案犯", "止步", "殉葬", "毕业", "永恒", "治理", "浇花", "润色", "清晰", "潜水", "爆炸", "爱国", "现金", "畅游", "白蚁", "盗贼", "知识分子", "砍伐", "砌筑", "硬币", "碰巧", "等候", "策略", "签名", "签到", "简直", "管辖",
        "救赎","游荡","毁灭","灌溉","强奸","诋毁","侮辱","做爱","打盹","奔跑","减税","飞翔","揣摩"};
        for (String country:countries){
            countryNames.add(country);
        }
        Random random = new Random();
        String selectedCountry = countryNames.get(random.nextInt(countryNames.size()));
        return selectedCountry;
    }
}