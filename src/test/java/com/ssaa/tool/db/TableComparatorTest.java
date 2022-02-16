package com.ssaa.tool.db;

import com.ssaa.tool.db.common.ComparisonResult;
import org.junit.jupiter.api.Test;

import static com.ssaa.tool.db.facade.DBCompareFacade.compare;
import static org.junit.jupiter.api.Assertions.assertEquals;


class TableComparatorTest {


    @Test
    void testTableIsEqual() {
        ComparisonResult result = compare("Table1", "Table2");
        assertEquals(true, result.isSame());
    }
}