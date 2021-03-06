package io.github.bergturing.point.utils;

import io.github.bergturing.point.utils.entity.Entity;
import org.junit.Test;

/**
 * 实体工具类的测试类
 *
 * @author bergturing@qq.com
 */
public class EntityUtilsTests {
    @Test
    public void testSetDataValue() {
        Entity entity = new Entity();

        EntityUtils.setDataValue(entity, "id", 11L);
        EntityUtils.setDataValue(entity, "name", "BergTuring");

        assert 11L == entity.getId();
        assert "BergTuring".equals(entity.getName());
    }

    @Test
    public void testGetDataValue() {
        Entity entity = new Entity();

        entity.setAge(11L);
        entity.setRemarks("BergTuring");

        assert 11L == (Long) EntityUtils.getDataValue(entity, "age");
        assert "BergTuring".equals((String) EntityUtils.getDataValue(entity, "remarks"));
    }
}
