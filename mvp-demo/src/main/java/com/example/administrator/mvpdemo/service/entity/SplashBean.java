package com.example.administrator.mvpdemo.service.entity;

/**
 * Created by jupiter on 2017/1/3.
 */
public class SplashBean {

    private String message;
    private AppStartPageBean appStartPage;
    private String code;
    private UserBean user;
    private boolean success;
    private String timeStr;

    public String getTimeStr() {
        return timeStr;
    }

    public void setTimeStr(String timeStr) {
        this.timeStr = timeStr;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AppStartPageBean getAppStartPage() {
        return appStartPage;
    }

    public void setAppStartPage(AppStartPageBean appStartPage) {
        this.appStartPage = appStartPage;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public static class AppStartPageBean {
        private String content;
        private String contentSource;
        private String createTime;
        private String imageUrl;
        private String imgSource;
        private int status;
        private int type;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getContentSource() {
            return contentSource;
        }

        public void setContentSource(String contentSource) {
            this.contentSource = contentSource;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getImgSource() {
            return imgSource;
        }

        public void setImgSource(String imgSource) {
            this.imgSource = imgSource;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }
}
