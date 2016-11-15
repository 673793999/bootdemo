package com.jtl.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2016/10/28 0028.
 */
public class UserInfo implements Serializable {

    private Long id;
    private String userName;
    private String email;
    private String password;
    private Date createTime;
    private String address;
    private String status;
    private String userPassword;
    private String userToken;
    private String userRealname;
    private Integer userSex;
    private String userPhoto;
    private String userNickname;
    private String userIdcard;
    private String userBirthday;
    private String userPhone;
    private String userPushid;
    private Date lockDate;
    private Boolean userLock;
    private Integer userWrongnumber;
    private Boolean isSetpaypwd;
    private Integer isAuthentication;
    private Long userSource;
    private String salt;
    private String userPasswordSalt;
    private String realnameAuthenticationImg;
    private String appType;
    private Boolean isSetsecurity;
    private Integer appealStatus;
    private Integer isOpennopay;
    private String deviceId;
    private String appChannel;
    private Long couponCount;

    public UserInfo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public String getUserRealname() {
        return userRealname;
    }

    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserIdcard() {
        return userIdcard;
    }

    public void setUserIdcard(String userIdcard) {
        this.userIdcard = userIdcard;
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPushid() {
        return userPushid;
    }

    public void setUserPushid(String userPushid) {
        this.userPushid = userPushid;
    }

    public Date getLockDate() {
        return lockDate;
    }

    public void setLockDate(Date lockDate) {
        this.lockDate = lockDate;
    }

    public Boolean getUserLock() {
        return userLock;
    }

    public void setUserLock(Boolean userLock) {
        this.userLock = userLock;
    }

    public Integer getUserWrongnumber() {
        return userWrongnumber;
    }

    public void setUserWrongnumber(Integer userWrongnumber) {
        this.userWrongnumber = userWrongnumber;
    }

    public Boolean getSetpaypwd() {
        return isSetpaypwd;
    }

    public void setSetpaypwd(Boolean setpaypwd) {
        isSetpaypwd = setpaypwd;
    }

    public Integer getIsAuthentication() {
        return isAuthentication;
    }

    public void setIsAuthentication(Integer isAuthentication) {
        this.isAuthentication = isAuthentication;
    }

    public Long getUserSource() {
        return userSource;
    }

    public void setUserSource(Long userSource) {
        this.userSource = userSource;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getUserPasswordSalt() {
        return userPasswordSalt;
    }

    public void setUserPasswordSalt(String userPasswordSalt) {
        this.userPasswordSalt = userPasswordSalt;
    }

    public String getRealnameAuthenticationImg() {
        return realnameAuthenticationImg;
    }

    public void setRealnameAuthenticationImg(String realnameAuthenticationImg) {
        this.realnameAuthenticationImg = realnameAuthenticationImg;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public Boolean getSetsecurity() {
        return isSetsecurity;
    }

    public void setSetsecurity(Boolean setsecurity) {
        isSetsecurity = setsecurity;
    }

    public Integer getAppealStatus() {
        return appealStatus;
    }

    public void setAppealStatus(Integer appealStatus) {
        this.appealStatus = appealStatus;
    }

    public Integer getIsOpennopay() {
        return isOpennopay;
    }

    public void setIsOpennopay(Integer isOpennopay) {
        this.isOpennopay = isOpennopay;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getAppChannel() {
        return appChannel;
    }

    public void setAppChannel(String appChannel) {
        this.appChannel = appChannel;
    }

    public Long getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(Long couponCount) {
        this.couponCount = couponCount;
    }
}
