package homes.xss.promise.common;

public class ResultBody<T> {

    private String code;
    private String msg;
    private T body;

    public static <T> ResultBody<T> ok() {
        ResultBody<T> resultBody = new ResultBody<>();
        resultBody.setCode("000000");
        resultBody.setMsg("ok");
        return resultBody;
    }

    public static <T> ResultBody<T> ok(T body) {
        ResultBody<T> resultBody = new ResultBody<>();
        resultBody.setCode("000000");
        resultBody.setMsg("ok");
        resultBody.setBody(body);
        return resultBody;
    }

    public static <T> ResultBody<T> failed() {
        ResultBody<T> resultBody = new ResultBody<>();
        resultBody.setCode("000500");
        resultBody.setMsg("failed");
        return resultBody;
    }

    public static <T> ResultBody<T> failed(String msg) {
        ResultBody<T> resultBody = new ResultBody<>();
        resultBody.setCode("000500");
        resultBody.setMsg(msg);
        return resultBody;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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
