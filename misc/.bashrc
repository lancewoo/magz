alias ls='ls --show-control-chars'  
alias l='ls -l --show-control-chars'  
alias la='ls -al --show-control-chars'  
alias dir='ls --show-control-chars'  
alias less='less --raw-control-chars'  

alias gitadd='git add'
alias gitstatus='git status'
alias gitbranch='git branch'
alias gitlog='git log'
alias gitcommit='git commit'
alias gitbranch='git branch'

alias uns='adb uninstall com.wl.magz'
alias ins='adb install /e/Work/workspace/Magz/bin/Magz.apk'
alias kk='uns;ins'

# �����ظ�������
export HISTCONTROL=ignoredups
# ������ð�ŷָ����Щ����
export HISTIGNORE="[   ]*:&:bg:fg:exit"
# ���ñ�����ʷ����ļ���С
export HISTFILESIZE=1000000000
# ������ʷ��������
export HISTSIZE=1000000
#ʹ��׷�Ӷ����Ǹ��ǵķ�ʽ������д���ļ�
shopt -s histappend
#ÿִ����һ������ͽ���д���ļ���bashÿִ����һ�������Ҫ��ʾһ���µ���ʾ����������ʾ��ʾ����ͬʱ����ִ�б����ڻ�������PROMPT_COMMAND��������ͨ��������Ϊ�ն����ñ��⣩
PROMPT_COMMAND="history -a; $PROMPT_COMMAND"


