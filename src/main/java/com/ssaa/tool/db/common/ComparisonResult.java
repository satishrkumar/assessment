package com.ssaa.tool.db.common;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class ComparisonResult {
    private boolean isSame;
    private Map<String,String> errors;
}
