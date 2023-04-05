# Ali-DDNS
阿里云 DDNS  域名动态解析API实现

**下载 deploy 文件夹** 
安装jdk 1.8 

DDNS.properties 配置域名和访问key等信息

> linux 部署
> 
> ddns.jar当前目录 执行:
>
````
nohup java -jar ddns.jar > ddns.log 2>&1 &
````


 > windows部署
> 
 >执行 ddns.bat脚本, 自启动设置bat到开机自启目录C:\ProgramData\Microsoft\Windows\Start Menu\Programs\StartUp

 
