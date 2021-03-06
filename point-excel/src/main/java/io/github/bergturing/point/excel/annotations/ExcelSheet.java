package io.github.bergturing.point.excel.annotations;

import io.github.bergturing.point.excel.constants.ExcelConstants;

import java.lang.annotation.*;

/**
 * sheet页的注解
 *
 * @author bergturing@qq.com
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface ExcelSheet {
    /**
     * 当前Sheet页的名称
     *
     * @return 当前Sheet页的名称
     */
    String sheetName() default ExcelConstants.DEFAULT_SHEET_NAME;
}
