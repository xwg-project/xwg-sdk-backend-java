package com.sdk.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Date;

public class StringUtil {
	
	@SuppressWarnings("unchecked")
    public static <T> T cast(Object obj) {
        return (T) obj;
    }
	
	public static String getRequestParamStr(Object obj){
		String result = "";
		try{
			Field[] fields = obj.getClass().getDeclaredFields(); //获取实体类的所有属性，返回Field数组
	        for(int j=0 ; j<fields.length ; j++){ //遍历所有属性
	        	Field field = fields[j];
	            String name = field.getName(); //获取属性的名字
	            String fname = name.substring(0,1).toUpperCase()+name.substring(1);
	            String ftype = field.getGenericType().toString();
	            Method m = obj.getClass().getMethod("get"+fname);
	            Object mObj = m.invoke(obj);
	            if(mObj==null){
	            	continue;
	            }
	            result+= (toHumpString(name)+"=");
            	if(ftype.equals("class java.lang.String")){//如果ftype是类类型，则前面包含"class "，后面跟类名
            		String value = (String) m.invoke(obj);//利用反射原理，调用getter方法获取属性值
					if(value != null){	//对属性值的操作逻辑（如改变编码
						result+=value;
					}
            	}
            	if(ftype.equals("class java.lang.Integer")){
            		Integer value = (Integer) m.invoke(obj);
            		if(value != null){
            			result+=value;
            		}
            	}
            	if(ftype.equals("class java.lang.Short")){
            		Short value = (Short) m.invoke(obj);
            		if(value != null){
            			result+=value;
            		}
            	}
            	if(ftype.equals("class java.lang.Double")){
            		Double value = (Double) m.invoke(obj);
            		if(value != null){
            			result+=value;
            		}
            	}
            	if(ftype.equals("class java.lang.Boolean")){
            		Boolean value = (Boolean) m.invoke(obj);
            		if(value != null){
            			result+=value;
            		}
            	}
            	if(ftype.equals("class java.util.Date")){
            		Date value = (Date) m.invoke(obj);
            		if(value != null){
            			result+=value;
            		}
            	}
            	
            	result+="&";
	        }
	        
	        if(!result.equals("")){
	        	result =  result.substring(0,result.length()-1);
	        }
		}catch(Exception e){
			e.printStackTrace();
		}
        return result;
	}
	

	//驼峰形转蛇形
	public static String toLineString(String string) {
		StringBuilder stringBuilder = new StringBuilder();
		String[] str = string.split("_");
		for (String string2 : str) {
			if(stringBuilder.length()==0){
				stringBuilder.append(string2);
		     }else {
				stringBuilder.append(string2.substring(0, 1).toUpperCase());
				stringBuilder.append(string2.substring(1));
			}
		}
		return stringBuilder.toString();
	}
	
	//蛇形转驼峰形
	public static String toHumpString(String string) {
		StringBuilder sb = new StringBuilder(string);
		int temp = 0;
		for(int i=0 ;i<string.length() ; i++){
			if(Character.isUpperCase(string.charAt(i))){
				sb.insert(i+temp,"_");
				temp+=1;
			}
		}
		return sb.toString().toLowerCase();
	}
	
	public static String getPlainString(String str){
		if(str==null||str.equals(""))
			return "";
		BigDecimal bd = new BigDecimal(str);
		return bd.toPlainString();
	}
	
	
	public static String trimZero(String str) {
	    if (str.indexOf(".") > 0) {
	        // 去掉多余的0
	    	str = str.replaceAll("0+?$", "");
	        // 如最后一位是.则去掉
	    	str = str.replaceAll("[.]$", "");
	    }
	    return str;
	}
	
}
