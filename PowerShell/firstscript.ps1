# Integrated Scripting Environment intro
$names = Import-csv D:\Documents\WT\working-talent\PowerShell\Census1000.csv
($names | sort -Property pcthispanic -Descending)[0].name

# First function(s)
function Do-Something {
    1 + 2
}

function Add-Numbers {
    param([int]$num1, [int]$num2)
    return $num1 + $num2
}

add-numbers 1 2
add-numbers -num1 1 -num2 2 # Can specify parameter names, then order irrelevant

$result = add-numbers -num1 1 -num2 2
$result += add-numbers 3 4
$result

# Another function
function Get-DirInfo($dir) {
    Get-ChildItem $dir -Recurse  # Recursively look at dir
}

Get-DirInfo D:\Documents\WT\working-talent
