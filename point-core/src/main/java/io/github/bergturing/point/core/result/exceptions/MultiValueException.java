package io.github.bergturing.point.core.result.exceptions;

/**
 * 增加批量值异常
 *
 * @author bergturing@qq.com
 */
public class MultiValueException extends RuntimeException {
    private static final long serialVersionUID = 7133083114184061889L;

    /**
     * 构造方法
     */
    public MultiValueException() {
        super("multi value exception");
    }
}
