package com.bqw.Proxy.Base;

public class IEProxy implements InfoExtractor{
    WebInfoExtractor webIE = new WebInfoExtractor();

    @Override
    public String queryData(String query) {
        query = preprocessQuery(query);
        String result = webIE.queryData(query);
        result = parserData(result);
        return result;
    }

    private String preprocessQuery(String query){
        return query+"?";
    }

    private String parserData(String result){
        return "result="+result;
    }

    public static void main(String...args){
        IEProxy proxy = new IEProxy();
        String result = proxy.queryData("查找张三的信息");
        System.out.println(result);
    }
}
