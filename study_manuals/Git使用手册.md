##### 如何删除github上的文件

[(81条消息) git如何删除github上的文件，亲测有效_github删除文件_薰珞婷紫小亭子的博客-CSDN博客](https://blog.csdn.net/weixin_41862755/article/details/127810043)

##### **github仓库建立及配置**

1、首先要先在github的官网注册一个属于自己的账号。https://github.com/

2、注册完成后需要一些简单的设置，先创建一个属于自己的仓库，repository

3、github上创建仓库 

4、让自己电脑上的代码同步到Github上所创建的库当中需要安装git的命令工具，Git Bash

获取密钥

首先要在本地创建一个ssh key ，这个的目的就是你现在需要在你电脑上获得一个密匙，获取之后，在你的GitHub账号里边输入之后，你的电脑就和你的GitHub账号联系在一起了，这样以后就可以十分方便的通过Git bash 随时上传你的代码。按照下列步骤本机关联GitHub账户：

回到Git Bash，输入：ssh -keygen -t rsa -C “your [email@.com”](mailto:email@.com\”) //一路回车

本机打开上述的存储.ssh文件的位置，打开id_rsa.pub或是id_rsa文件，复制里面的内容（秘钥）。

在github上找到SSH and GPG keys这个选项之后，在网页右上角点击new SSH Key按钮创建秘钥，title是你给你的秘钥起一个标题，key里面就把你刚才复制的秘钥粘贴进去，点击add SSH KEY。

回到Git Bash，输入命令：$ ssh -T git@github.com ，再输入yes, 出现如下界面，就说明链接成功了。

设置一些账号名，邮箱，（name最好和GitHub上边的一样，email是一定要是注册GitHub的那个邮箱地址）：

git config --global user.name “KingYangGo”

git config --global user.email [“yang_kang9@163.com”](mailto:\“yang_kang9@163.com\”)

git@github.com:KingYangGo/SpringCloud.git//github仓库地址

##### **git add** 命令可将该文件添加到暂存区。

添加一个或多个文件到暂存区：

```
git add [file1] [file2] ...
```

添加指定目录到暂存区，包括子目录：

```
git add [dir]
```

添加当前目录下的所有文件到暂存区：

```java
git add .
```

##### git add .和 git add *

git add . 和 git add * 的区别：git add . 会把本地所有untrack的文件都加入暂存区，并且会根据 .gitignore 做过滤；但是 git add * 会忽略 .gitignore 把任何文件都加

##### 本地仓库与远程仓库建立联系

git init

 git remote add origin git@github.com:KingYangGo/SpringCloud.git

##### .ssh本地密钥路径

C:\Users\用户名\.ssh

##### fatal: Could not read from remote repository.

[(81条消息) 解决 “fatal: Could not read from remote repository.“_I'm GHB的博客-CSDN博客](https://blog.csdn.net/weixin_40922744/article/details/107576748)

1、git stash

暂存工作区修改的内容

可以stash多次，从最近一次的commit读取相关内容。 

2、git stash pop

和 git stash 相反，git stash pop 是恢复暂存的工作区内容

值得注意的是， git stash pop 获取到的是最近一次stash进去的内容，也就是说如果stash两次或者多次，那么恢复的是最新一次stash进去的内容。

那要怎么查看stash了多少次呢？

3、git stash list

查询工作区所有stash的列表

可以看到，我本地是有6个暂存的。如果想恢复stash@{2}，只需要：

4、git stash apply

git stash apply stash@{2}
如果不指定，直接 git stash pop 默认恢复的就是最新一次stash

##### git branch -M main

`git branch -M main` 命令会将本地分支 `main` 的名称更改为 `main`,同时也会将本地分支 `main` 与远程分支 `main` 的名称保持一致。因此，在执行了这个命令后，本地分支 `main` 与远程分支 `main` 的名称已经一致，如果需要将本地分支 `main` 恢复为原始名称，可以使用 `git branch -u` 命令将本地分支 `main` 的链接重新指向远程分支 `main`,或者使用 `git reset` 命令将本地分支 `main` 恢复到原始状态。

[git常用命令的解释 (xjx100.cn)](https://www.xjx100.cn/news/176762.html?action=onClick)

##### git push -uf origin main

在这个命令中，`-u` 是一个选项，表示将本地分支与远程分支进行关联。这样，在以后的推送操作中，您只需使用`git push`，Git就会自动将更改推送到正确的远程分支。

`-f` 是一个选项，表示强制推送。如果远程分支已经存在，并且您想要覆盖远程分支的内容，可以使用该选项。

`origin` 是远程仓库的名称，通常是您克隆或添加的远程仓库的默认名称。

`main` 是要推送到远程仓库的本地分支的名称。

综上所述，`git push -uf origin main` 命令的作用是将本地分支的更改强制推送到名为`origin`的远程仓库的`main`分支。

`origin` 后面并没有省略默认的远程分支名称。在 `git push` 命令中，`origin` 是指远程仓库的名称，而不是远程分支的名称。

通常情况下，当您克隆一个远程仓库时，Git会自动为您设置一个默认的远程分支名称，通常是与本地分支名称相同。因此，如果您在本地有一个名为 `main` 的分支，并且克隆的远程仓库也有一个名为 `main` 的分支，那么 `git push -uf origin main` 命令将会将本地的 `main` 分支推送到远程仓库的 `main` 分支。

如果您想要将本地分支推送到远程仓库的不同分支，可以在命令中指定远程分支的名称，例如 `git push -uf origin local-branch:remote-branch`，其中 `local-branch` 是本地分支的名称，`remote-branch` 是远程分支的名称。

