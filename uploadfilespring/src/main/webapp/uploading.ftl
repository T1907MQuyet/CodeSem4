<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Upload file</title>
</head>
<body>
<form name="uploadForm" action="/" method="post" enctype="multipart/form-data">
    <p>
        <input id="fileInput" type="file" name="uploadingFile" onchange="updateSize();"multiple >
        File selectde: <span id="fileNum">0</span>
        Total size <span id="fileSize">0</span>
    </p>
    <p>
        <input type="submit" value="Upload files">
    </p>
</form>
<div>
    Upload files:
</div>
<#list file as file>
    <div>
        ${file.getName()}
    </div>
</#list>
<script>
    function updateSize() {
        var nBytes = 0,
            oFiles = document.getElementById("fileInput").files,
            nFiles = oFiles.length;
        for (var nFileId = 0; nFileId < nFiles; nFileId++) {
            nBytes += oFiles[nFileId].size;
        }

        var sOutput = nBytes + " bytes";
// optional code for multiples approximation
        for (var aMultiples = ["KiB", "MiB", "GiB", "TiB", "PiB", "EiB", "ZiB", "YiB"], nMultiple = 0, nApprox = nBytes / 1024; nApprox > 1; nApprox /= 1024, nMultiple++) {
            sOutput = nApprox.toFixed(3) + " " + aMultiples[nMultiple] + " (" + nBytes + " bytes)";
        }
// end of optional code

        document.getElementById("fileNum").innerHTML = nFiles;
        document.getElementById("fileSize").innerHTML = sOutput;
    }
</script>
</body>
</html>