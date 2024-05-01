package $Ku.byUser.Object;

public class ByUserStrings extends $Ku.by.Object.ByObject {
    public static java.lang.String language;

    public ByUserStrings() {
    }


    private static java.lang.String Format(java.lang.String format, java.lang.Object[] args) {
        if (java.util.Objects.equals(format, null)) {
            return "";
        }
        if (java.util.Objects.equals(args, null)) {
            args = new java.lang.Object[0];
        }
        for (java.lang.Integer i = 0; i < args.length; i++) {
            java.lang.Object arg = args[i];
            if (java.util.Objects.equals(arg, null)) {
                arg = "";
            }
            format = format.replace("{" + i + "}", arg.toString());
        }
        return format;
    }

    private static java.lang.String Format(java.lang.String format, java.lang.Object arg1) {
        return format.replace("{0}", java.util.Objects.equals(arg1, null) ? "" : arg1.toString());
    }

    private static java.lang.String Format(java.lang.String format, java.lang.Object arg1, java.lang.Object arg2) {
        return format.replace("{0}", java.util.Objects.equals(arg1, null) ? "" : arg1.toString()).replace("{1}", java.util.Objects.equals(arg2, null) ? "" : arg2.toString());
    }

    private static java.lang.String Format(java.lang.String format, java.lang.Object arg1, java.lang.Object arg2, java.lang.Object arg3) {
        return Format(format, new java.lang.Object[]{arg1,arg2,arg3});
    }

    private static java.lang.String Format(java.lang.String format, java.lang.Object arg1, java.lang.Object arg2, java.lang.Object arg3, java.lang.Object arg4) {
        return Format(format, new java.lang.Object[]{arg1,arg2,arg3,arg4});
    }

    private static java.lang.String getString(java.lang.String ch, java.lang.String en) {
        return java.util.Objects.equals((language != null ? language : $Ku.by.Object.System.getLanguage()), "en-us") ? en : ch;
    }

    public static java.lang.String Info_IP_Locked_Template(java.lang.String ip, java.lang.Integer interval) {
        return Format(getString("当前IP${0}已经被锁定，锁定时间:${1}分钟!", "The IP {0} has been locked, resting lock interval: {1} minutes."), ip, interval);
    }

    public static java.lang.String Info_Login_MultipleTimes_Locked(java.lang.Integer interval) {
        return Format(getString("您当前用户名已经连续登录出错超过5次，当前账号已经被锁定，请${0}小时后再尝试！", "You have input a wrong password 5 times, the current user has been locked, retry after {0} hours."), interval);
    }

    public static java.lang.String Info_Login_MultipleTimes_Will_Lock(java.lang.Integer interval) {
        return Format(getString("用户名或密码错误，请重试！连续出错5次则该账号会被锁定{0}分钟！", "Wrong user or password, please agian(error 5 times in a row, the account will be locked for {0} minutes!)"), interval);
    }

    public static java.lang.String Info_Login_Completed() {
        return getString("登录成功！", "Login succeed! ");
    }

    public static java.lang.String Info_Illegal_User() {
        return getString("用户非法！", "Illegal user, please refresh page and try login again! ");
    }

    public static java.lang.String Info_Freezed_User() {
        return getString("当前用户已冻结！", "This user account has been frozen! ");
    }

    public static java.lang.String Info_User_Freezed() {
        return getString("当前用户已经被冻结，如想继续使用请联系客服！", "The current user has been frozen. If you want to continue using it, please contact customer service!");
    }

    public static java.lang.String Info_Annoymous_User_Freezed_Deny_Service() {
        return getString("当前匿名用户已经被冻结，服务器拒绝提供服务！", "This annoymous user has been frozen. Server denys to provide any service!");
    }

    public static java.lang.String Info_Login_Failed_RSA_Missing() {
        return getString("没有找到当前session对应的RSA证书，\r\n你需要刷新缓存Ctrl+Shift+delete 并且选中Cookie及其他网站数据项,\r\n或检查你的web端与服务端布署的url是否在同一域下!", "Login failed. the RSA certificate for the current session cannot be found, you need to refresh the cache (Ctrl+Shift+delete) and check Cookies, and check if the URL deployed on your web and server is in the same domain!");
    }

    public static java.lang.String Info_Login_Failed() {
        return getString("登录失败！", "Login failed. ");
    }

    public static java.lang.String Info_Register_Completed_Congratulation() {
        return getString("恭喜，注册成功！", "Congratulations! Register Completed!");
    }

    public static java.lang.String Info_Register_Completed() {
        return getString("注册成功！", "Register Completed!");
    }

    public static java.lang.String Info_Register_Failed() {
        return getString("注册失败！", "Register failed ");
    }

    public static java.lang.String Info_Register_Failed_Template(java.lang.String resultInfo) {
        return getString("注册失败：", "Register failed, details: ") + resultInfo;
    }

    public static java.lang.String Info_Register_UserName_Cannot_Be_Null() {
        return getString("用户[user]行 ，f_userRow 不能为空！", "The userName in [user] cannot be null ");
    }

    public static java.lang.String Info_Modify_Completed() {
        return getString("修改成功！", "Modify succeed! ");
    }

    public static java.lang.String Info_Modify_Failed_Illegal() {
        return getString("当前用户非法，或登录时间过长,修改失败！", "Modify failed, timeout or illegal user, please login and try again. ");
    }

    public static java.lang.String Info_Modify_Failed_Freezed() {
        return getString("当前用户已冻结，不允许修改！", "Modify failed, the current user account has been frozen! ");
    }

    public static java.lang.String Info_Modify_Failed_Old_Password_Wrong() {
        return getString("原密码错误！", "Modify failed, the inputed original password is wrong. ");
    }

    public static java.lang.String Info_Modify_Failed() {
        return getString("修改失败！", "Modify failed! ");
    }

    public static java.lang.String Info_Modify_Failed_Template(java.lang.String resultInfo) {
        return getString("修改失败，", "Modify failed, details: ") + resultInfo + '!';
    }

    public static java.lang.String Info_Reset_Password_Completed() {
        return getString("密码重设成功！", "Reset Password succeed! ");
    }

    public static java.lang.String Info_SecurityCode_Invalid() {
        return getString("安全码非法", "The security code is invalid.");
    }

    public static java.lang.String Info_SecurityCode_Session_Timeout() {
        return getString("会话过期，没有在服务器端找到发送的安全码信息", "Session timeout, cannot find a matching security code in the server.");
    }

    public static java.lang.String Info_SecurityCode_Dismatch() {
        return getString("安全码不对！", "The security code dismatches, please try again.");
    }

    public static java.lang.String Info_SecurityCode_Timeout() {
        return getString("超时！", "Timeout!.");
    }

    public static java.lang.String Info_SecurityCode_Verification_Succeed() {
        return getString("验证成功！", "Verification succeed!");
    }

    public static java.lang.String Info_SecurityCode_Missing() {
        return getString("没有找到安全码信息！", "Cannot find a matching safe code!");
    }

    public static java.lang.String Info_Cookie_Invalid(java.lang.String f_cookieID) {
        return Format(getString("非法的cookie ID [{0}] 信息！", "The cookie ID [{0}] is invalid."), f_cookieID);
    }

    public static java.lang.String Info_Password_Pattern_Invalid() {
        return getString("密码必须包含数字和字母且长度不得小于8、大于32", "The length of password must be larger than or equal to 8 and smaller than 32, and only digits and letters are valid.");
    }

    public static java.lang.String Info_UserName_Invalid() {
        return getString("用户名非法", "The user name is invalid.");
    }

    public static java.lang.String Info_UserName_Invalid_Or_Not_Exist() {
        return getString("用户非法或不存在！", "The user name is invalid, or the name does not exist.");
    }

    public static java.lang.String Info_UserName_Invalid_Template(java.lang.String verifyResult) {
        return getString("用户名非法:", "The user name is invalid, details:") + verifyResult;
    }

    public static java.lang.String Info_UserName_LengthOrPattern_Invalid() {
        return getString("用户名长度2-32之间，仅支持数字、字母、下划线", "The length of a user name must be larger than 2 and smaller than 32, and only digits, letters, '_' and surrogates can be used.");
    }

    public static java.lang.String Info_UserName_Length_Invalid() {
        return getString("用户名长度不得小于2、大于32", "The length of a user name must be larger than 2 and smaller than 32.");
    }

    public static java.lang.String Info_UserName_Pattern_Invalid() {
        return getString("用户名仅支持数字、字母、下划线以及双字节符（中文、韩文、日文等）", "Only digits, letters, '_' and surrogates(such as Chinese letters, korea letters, japanese letters) are supported in user name.");
    }

    public static java.lang.String Info_UserName_Not_Exist() {
        return getString("系统不存在这个用户", "The given user name does not exist.");
    }

    public static java.lang.String Info_UserName_Already_Exist() {
        return getString("该用户已经存在！", "The given user name already exists.");
    }

    public static java.lang.String Info_Email_Invalid() {
        return getString("邮箱格式非法", "The email is invalid.");
    }

    public static java.lang.String Info_Email_Already_Exists() {
        return getString("邮箱号码已经存在！", "An account related to the given email is already being used!");
    }

    public static java.lang.String Info_Email_Too_Long_Or_Too_Short() {
        return getString("邮箱最长不超过64个字符,或大于6个字符！", "Email length must be shorter than 64 and longer than 6.");
    }

    public static java.lang.String Info_Email_Format_Invalid() {
        return getString("邮箱格式非法", "Email format invalid.");
    }

    public static java.lang.String Info_Email_Format_Invalid_Template(java.lang.String f_mail) {
        return Format(getString("邮箱[{0}]格式非法", "The format of email [{0}] is invalid."), f_mail);
    }

    public static java.lang.String Info_Email_Not_Exist() {
        return getString("系统中不存在这个email", "The given email does not exist an account.");
    }

    public static java.lang.String Info_Email_Freezed() {
        return getString("当前邮箱所属的用户已被冻结", "The account belonging to this email has been frozen.");
    }

    public static java.lang.String Info_Phone_Invalid() {
        return getString("手机号码格式非法", "The phone number is invalid.");
    }

    public static java.lang.String Info_Phone_Invalid_Or_Not_Exist() {
        return getString("手机号非法或不存在！", "The phone number is invalid, or no account is related to the given phone number.");
    }

    public static java.lang.String Info_Phone_Not_Exist() {
        return getString("系统不存在这个手机", "No account is related to the given phone number..");
    }

    public static java.lang.String Info_Phone_Already_Exists() {
        return getString("手机号码已经在系统中存在！", "An account related to the given phone number already exists!");
    }

    public static java.lang.String Info_Phone_Must_11_Digits() {
        return getString("手机号码位数必须是11位，必须是数字！", "Phone number must be a 11-digit number");
    }

    public static java.lang.String Info_Phone_Freezed() {
        return getString("当前手机所属的用户已被冻结", "The account belonging to this phone number has been frozen.");
    }

    public static java.lang.String Info_Send_SecurityCode_Mobile() {
        return getString("已发送安全码到你的手机，15分钟之内有效！", "A security code has been sent to your phone and is valid for 15 minutes.");
    }

    public static java.lang.String Info_Send_SecurityCode_Mobile_Failed() {
        return getString("发送手机短信失败，运营商返回信息：", "Sending security code to your phone failed, info returned by the SMS server: ");
    }

    public static java.lang.String Info_Send_SecurityCode_Email_Config_Missing() {
        return getString("没有配置邮件运营商，账号、密码，应在系统第一次启动时配置这些参数", "The mail service provider, account number or password are not configured, these parameters should be configured the first time system start-ups.");
    }

    public static java.lang.String Info_Send_SecurityCode_Email_Title() {
        return getString("拜语言密码找回", "By-language password recovery");
    }

    public static java.lang.String Info_Send_SecurityCode_Email_Content(java.lang.Integer tmpCodeValue) {
        return Format(getString("安全码：{0}，有效期15分钟，勿将此码告诉他人，本邮件由系统发送，请勿回复！", "Your security code is: {0}, it will be valid for 15 minutes, please do not share the code. (This email is send from a server, please do not reply to it.)"), tmpCodeValue);
    }

    public static java.lang.String Info_Send_Security_Code_Email_Succeed(java.lang.String f_mail) {
        return Format(getString("已经往您的邮箱[{0}]发送了安全码！", "A security code has been sent to your email [{0}]."), f_mail);
    }

    public static java.lang.String Info_Send_Security_Code_Email_Failed(java.lang.String f_mail) {
        return Format(getString("发送安全码失败，邮箱：{0} ", "Failed to send a security code to email {0}."), f_mail);
    }

    public static java.lang.String Info_Send_Security_Code_Failed() {
        return getString("发送安全码失败  ", "Failed to send a security code, details:");
    }

    public static java.lang.String Annoymous_User_Name_Template(java.lang.Integer rand) {
        return Format(getString("匿名用户{0}", "Annoymous user {0}"), rand);
    }

    public static java.lang.String Info_RSA_Public_Key_Register_Failed() {
        return getString("当前在向服务器注册RSA公钥证书时没有成功,请重新刷新后再次尝试!", "Failed to register a RSA public key to the RSA server, please refresh and retry.");
    }

    public static java.lang.String Info_Upload_Format_Unsupported(java.lang.String formats) {
        return Format(getString("仅支持上传扩展名为[{0}]格式的文件！", "Only files with extension [{0}] can be uploaded!"), formats);
    }

    public static java.lang.String Info_Upload_File_To_Large(java.lang.Integer size) {
        return Format(getString("文件太大，不能大于[{0}]K！", "The file is too large to upload, the maximum is [{0}] KB!"), size);
    }

    public static java.lang.String Info_Upload_File_Only_Allow_Icon() {
        return getString("当前仅允许上传用户图标文件！", "Only user icon files are allowed to be uploaded!");
    }

    public static java.lang.String Info_Upload_User_Not_Login() {
        return getString("当前用户还没有登录！", "Cannot upload, please login and retry.");
    }

    public static java.lang.String Info_Upload_Completed() {
        return getString("上传成功！", "Upload Completed!");
    }

    public static java.lang.String Info_Upload_Failed_Template(java.lang.String resultInfo) {
        return Format(getString("上传失败,原因:[{0}]！", "Upload failed, details: {0}"), resultInfo);
    }

    public static java.lang.String Info_SQL_Execution_Failed() {
        return getString("执行SQL失败：", "SQL execution failed, details: ");
    }

    public static java.lang.String Info_Operation_Limited() {
        return getString("仅支持：增加与删除！", "Only add and delete operations are allowed!");
    }

    public static java.lang.String Info_Add_Admin_Succeed() {
        return getString("加入管理员成功！", "Adding admin succeeded!");
    }

    public static java.lang.String Info_Add_Admin_Failed_Template(java.lang.String result) {
        return Format(getString("加入管理员失败：{0}！", "Adding admin failed, details: {0}!"), result);
    }

    public static java.lang.String Info_Delete_Admin_Succeed() {
        return getString("删除管理员成功！", "Deleting admin succeeded!");
    }

    public static java.lang.String Info_Delete_Admin_Failed() {
        return getString("删除管理员失败！", "Deleting admin failed!");
    }

    public static java.lang.String Info_Operation_Forbidden_Must_Be_Admin() {
        return getString("权限不够，禁止的操作！", "Operation not allowed, please use a admin account and try again!");
    }

    public static java.lang.String Info_Operation_Forbidden_Only_Admin_Can_Manage() {
        return getString("权限不够，禁止进入管理界面！", "Cannot open the manage dialog, please use a admin account and try again!");
    }

    public static java.lang.String Info_Entered_Passwords_Not_Match() {
        return getString("两次输入的新密码不一致！", "The second password does not match the first one!");
    }

    public static java.lang.String Info_SecurityCode_Not_Valid() {
        return getString("请输入发到你手机或邮箱中的安全码，仅支持数字!", "Please enter the security code sent to your phone or email, only digits are allowed.");
    }

    public static java.lang.String Info_SecurityCode_Not_Entered() {
        return getString("请填入发送到你手机或邮箱中的验证码后，再尝试该操作！", "Please enter the security code sent to your phone or email and try again!");
    }

    public static java.lang.String UI_MenuItem_User() {
        return getString("用户", "User");
    }

    public static java.lang.String UI_MenuItem_RegisterUser() {
        return getString("注册新用户", "Register as a User");
    }

    public static java.lang.String UI_MenuItem_Login() {
        return getString("登录", "Login");
    }

    public static java.lang.String UI_MenuItem_ChangePassword() {
        return getString("密码修改", "Change password");
    }

    public static java.lang.String UI_MenuItem_UploadIcon() {
        return getString("上传个性头像图标", "Upload an icon");
    }

    public static java.lang.String UI_MenuItem_Admin() {
        return getString("管理员管理", "Admin Management");
    }

    public static java.lang.String UI_MenuItem_Exit() {
        return getString("退出", "Exit");
    }

    public static java.lang.String UI_user_diLogin_Title() {
        return getString("登录", "Login");
    }

    public static java.lang.String UI_user_diLogin_cLblName_Text() {
        return getString("用户名：", "User Name: ");
    }

    public static java.lang.String UI_user_diLogin_cLblPwd_Text() {
        return getString("密码：", "Password: ");
    }

    public static java.lang.String UI_user_diLogin_cBtnLogin_Text() {
        return getString("登录", "Login");
    }

    public static java.lang.String UI_user_diLogin_cBtnReg_Text() {
        return getString("注册", "Register");
    }

    public static java.lang.String UI_user_diLogin_cLblFindPwd_Text() {
        return getString("忘记密码了？点击找回", "Forgot your password? Click here to retrieve.");
    }

    public static java.lang.String UI_user_diModifPwd_Title() {
        return getString("密码修改", "Password Modification");
    }

    public static java.lang.String UI_user_diModifPwd_cLblSourcePwd_Text() {
        return getString("原密码：", "Original password: ");
    }

    public static java.lang.String UI_user_diModifPwd_cLblNewPwd_Text() {
        return getString("新密码：", "New password: ");
    }

    public static java.lang.String UI_user_diModifPwd_cLblConfirmNewPwd_Text() {
        return getString("请确认新密码：", "Please confirm the new password: ");
    }

    public static java.lang.String UI_user_diModifPwd_cBtnSure_Text() {
        return getString("确认", "Confirm");
    }

    public static java.lang.String UI_user_diModifPwd_cBtnCancel_Text() {
        return getString("取消", "Cancel");
    }

    public static java.lang.String UI_user_diUserReg_Title() {
        return getString("用户注册", "User Registration");
    }

    public static java.lang.String UI_user_diUserReg_cLblName_Text() {
        return getString("用户名：", "User Name: ");
    }

    public static java.lang.String UI_user_diUserReg_cLblPwd_Text() {
        return getString("密码：", "Password: ");
    }

    public static java.lang.String UI_user_diUserReg_cLblConfirmPwd_Text() {
        return getString("再输入一遍：", "Please enter again: ");
    }

    public static java.lang.String UI_user_diUserReg_cLblMobile_Text() {
        return getString("手机：", "Phone Number: ");
    }

    public static java.lang.String UI_user_diUserReg_cLblMail_Text() {
        return getString("邮箱：", "Email: ");
    }

    public static java.lang.String UI_user_diUserReg_cLblSafetyCode_Text() {
        return getString("请输入安全码：", "Please enter the security code: ");
    }

    public static java.lang.String UI_user_diUserReg_cLblSendCode_Text() {
        return getString("点击发送安全码", "Click here to send a security code.");
    }

    public static java.lang.String UI_user_diUserReg_cBtnReg_Text() {
        return getString("注册", "Register");
    }

    public static java.lang.String UI_user_diUserReg_cBtnCancel_Text() {
        return getString("取消", "Cancel");
    }

    public static java.lang.String UI_user_dlForgetPwd_Title() {
        return getString("密码找回", "Password Retrieval");
    }

    public static java.lang.String UI_user_dlForgetPwd_cRdGroup_Text() {
        return getString("我记得", "I remember...");
    }

    public static java.lang.String UI_user_dlForgetPwd_rdUserName_Text() {
        return getString("用户名", "User name");
    }

    public static java.lang.String UI_user_dlForgetPwd_rdEmail_Text() {
        return getString("邮箱", "Email");
    }

    public static java.lang.String UI_user_dlForgetPwd_rdPhone_Text() {
        return getString("手机号", "Phone number");
    }

    public static java.lang.String UI_user_dlForgetPwd_cLblValue_Text() {
        return getString("请输入账号相关信息：", "Please enter the information related with your account: ");
    }

    public static java.lang.String UI_user_dlForgetPwd_cTxtValue_placeholder() {
        return getString("用户名/手机号/邮箱", "User Name / Phone Number / Email");
    }

    public static java.lang.String UI_user_dlForgetPwd_cBtnSend_Text() {
        return getString("确认发送验证码", "Confirm to send a security code");
    }

    public static java.lang.String UI_user_dlForgetPwd_cBtnCancel_Text() {
        return getString("取消", "Cancel");
    }

    public static java.lang.String UI_user_RetrievePassword_Title() {
        return getString("重设密码找回", "Password Resetting");
    }

    public static java.lang.String UI_user_RetrievePassword_cLblSafetyCode_Text() {
        return getString("请输入安全码：", "Please enter the security code: ");
    }

    public static java.lang.String UI_user_RetrievePassword_cLblPassword_Text() {
        return getString("请输入新密码：", "Please enter your new password: ");
    }

    public static java.lang.String UI_user_RetrievePassword_cLblConfirmPassword_Text() {
        return getString("请确认密码：", "Re-enter your password: ");
    }

    public static java.lang.String UI_user_RetrievePassword_cBtnSure_Text() {
        return getString("确认", "Confirm");
    }

    public static java.lang.String UI_user_RetrievePassword_cBtnCancel_Text() {
        return getString("取消", "Cancel");
    }

    public static java.lang.String UI_user_diUserLog_Title() {
        return getString("用户登录日志", "User Login Logs");
    }

    public static java.lang.String UI_user_modifyInfo_Title() {
        return getString("修改个人信息", "Modify Personal Information");
    }

    public static java.lang.String UI_user_modifyInfo_cNameLabel_Text() {
        return getString("请输入新名称：", "Please enter a new name: ");
    }

    public static java.lang.String UI_user_modifyInfo_cSureButton_Text() {
        return getString("确认", "Confirm");
    }

    public static java.lang.String UI_user_modifyInfo_cCancelButton_Text() {
        return getString("取消", "Cancel");
    }

    public static java.lang.String UI_userICO_diUploadICO_Title() {
        return getString("上传用户图标", "Upload a User Icon");
    }

    public static java.lang.String UI_userICO_diUploadICO_cFilePicker_Text() {
        return getString("上传本地文件", "Upload local files");
    }

    public static java.lang.String UI_userICO_diUploadICO_cFilePicker_Tooltip() {
        return getString("上传本地文件,支持外部文件拖入", "Upload local files, support dragging external files here.");
    }

    public static java.lang.String UI_userAdmin_adminManager_Title() {
        return getString("管理员管理", "Admin Management");
    }

    public static java.lang.String UI_userAdmin_adminManager_cBtnAdd_Text() {
        return getString("确认加入", "Confirm Adding");
    }

    public static java.lang.String UI_userAdmin_adminManager_cBtnDelete_Text() {
        return getString("确认删除", "Confirm Deleting");
    }

    public static java.lang.String UI_userAdmin_adminManager_columnUserID_Text() {
        return getString(" 用户ID", " User ID");
    }

    public static java.lang.String UI_userAdmin_adminManager_columnUserName_Text() {
        return getString(" 用户名", " User name");
    }

    public static java.lang.String UI_userAdmin_adminManager_columnUserDisplayName_Text() {
        return getString(" 用户显示名", " User display name");
    }

    public static java.lang.String UI_userAdmin_adminManager_columnUserPhone_Text() {
        return getString(" 用户手机", " User Phone number");
    }

    public static java.lang.String UI_userAdmin_adminManager_menuitem_AddUser_Text() {
        return getString("增加管理员", "Add User");
    }

    public static java.lang.String UI_userAdmin_adminManager_menuitem_DeleteUser_Text() {
        return getString("删除管理员", "Delete User");
    }

    public static java.lang.String UI_user_popupUser_Title() {
        return getString("弹窗选择用户", "Users Selection Popup");
    }

    public static java.lang.String UI_user_popupUser_cLblKeyword_Text() {
        return getString("搜索", "Search");
    }

    public static java.lang.String UI_user_popupUser_cTxtKeyword_Placeholder() {
        return getString("用户名、手机、邮箱", "User Name / Phone Number / Email");
    }

    public static java.lang.String UI_user_popupUser_cBtnSearch_Text() {
        return getString("查询", "Query");
    }

    public static java.lang.String UI_user_popupUser_cBtnOk_Text() {
        return getString("确认加入", "Confirm");
    }

    public $Ku.byUser.Object.ByUserStrings $getThis$Ku_byUser_Object_ByUserStrings() {
        return this;
    }
}
