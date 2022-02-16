package com.ssaa.tool.db.facade;

import com.ssaa.tool.db.common.ComparisonResult;

public final class DBCompareFacade {

    public static ComparisonResult compare(final String tableNameActual, final String tableNameExpected) {
     return ComparisonResult.builder().isSame(false).build();
    }

}
