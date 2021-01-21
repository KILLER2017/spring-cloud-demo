package top.alvinsite.common.exception;

/**
 * @author Alvin
 * @email 54304634@qq.com
 * @date 2021/1/20 18:26
 */
public class BeanUtilsException extends BaseException{
    public BeanUtilsException(String s, Exception e) {
        super(GeneralStatuaCode.B0001, s, e);
    }
}
