package com.bergturing.point.dal.annotations;

import java.lang.annotation.*;

/**
 * 分布式应用锁的注解
 *
 * @author bergturing@qq.com
 * @apiNote 2019/4/24
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface DistributedApplicationLock {
}
