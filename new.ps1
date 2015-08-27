if(Child-Items =c:\demo\Branch)
{
    git pull origin 
}
else
{
  git init 
$cloneurl = read-host "enter the url of the git repo :"
git clone $cloneurl

}