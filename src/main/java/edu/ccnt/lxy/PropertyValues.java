package edu.ccnt.lxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LXY on 2017/10/20.
 */
public class PropertyValues {       //bean的属性列表

    private List<PropertyValue> propertyValueList = new ArrayList<PropertyValue>();

    public List<PropertyValue> getPropertyValues(){
        return this.propertyValueList;
    }

    public void applyPropertyValues(PropertyValue propertyValue ){      //这里到时候可以扩展，如去重等
        this.propertyValueList.add(propertyValue);
    }



}
