package com.neu.carbon.distribusion.emun;

public enum IndustryEnum {
    CEMENT("cement", "水泥"),
    STEEL("steel", "钢铁"),
    PETROCHEMICAL("petrifaction", "石化"),
    PAPERMAKING("papermaking", "造纸"),
    CIVIL_AVIATION("civil_aviation", "民航"),
    DATA_CENTER("dc", "数据中心"),
    TRANSPORT("traffic", "交通"),
    TEXTILE("spinning", "纺织"),
    AIRPORT("airport", "机场");

    private String industry;
    private String desc;

    IndustryEnum(String industry, String desc) {
        this.industry = industry;
        this.desc = desc;
    }

    public static String getIndustry(String desc){
        for(IndustryEnum e: IndustryEnum.values()){
            if(e.getDesc().equals(desc)){
                return e.getIndustry();
            }
        }
        return desc;
    }

    public static String getDesc(String industry){
        for(IndustryEnum e: IndustryEnum.values()){
            if(e.getIndustry().equals(industry)){
                return e.getDesc();
            }
        }
        return industry;
    }

    public String getIndustry() {
        return this.industry;
    }

    public String getDesc() {
        return this.desc;
    }
}
