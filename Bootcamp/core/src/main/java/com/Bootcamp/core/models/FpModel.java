package com.Bootcamp.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FpModel {
    @Inject
    private List<MultifieldModelForFp> fieldList;
    public List<MultifieldModelForFp> getFieldList() {
        return fieldList;
    }
}