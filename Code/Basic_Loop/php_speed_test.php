<?php
    $startTime = round(microtime(true) * 1000);
    $statements = 0;

    while (round(microtime(true) * 1000) - $startTime <= 1000) {
        $statements++;
    }

    echo $statements;
?>
