package homes.xss.promise.common;

public class ResultBody<T> {

    private Integer code;
    private String msg;
    private T body;

    public static <T> ResultBody<T> ok() {
        ResultBody<T> resultBody = new ResultBody<>();
        resultBody.setCode(20000);
        resultBody.setMsg("ok");
        return resultBody;
    }

    public static <T> ResultBody<T> ok(T body) {
        ResultBody<T> resultBody = new ResultBody<>();
        resultBody.setCode(20000);
        resultBody.setMsg("ok");
        resultBody.setBody(body);
        return resultBody;
    }

    public static <T> ResultBody<T> failed() {
        ResultBody<T> resultBody = new ResultBody<>();
        resultBody.setCode(50000);
        resultBody.setMsg("failed");
        return resultBody;
    }

    public static <T> ResultBody<T> failed(String msg) {
        ResultBody<T> resultBody = new ResultBody<>();
        resultBody.setCode(50000);
        resultBody.setMsg(msg);
        return resultBody;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
