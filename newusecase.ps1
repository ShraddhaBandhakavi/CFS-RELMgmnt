#Get the path of the git commit 
$path = read-host "enter the path for doing git commit :"
$Test-path = $path
if($Test-path==$path)
{
   write-host "correct location of repo"
}
else 
{
   write-host "not our desired repo"
}
