Module Main
    Public Sub Main ()
        Dim startTime As Double     = Timer
        Dim statements as Integer   = 0

        While Timer  - startTime <= 1
            statements += 1
        end While

        Console.WriteLine(statements)

    End Sub
End Module
