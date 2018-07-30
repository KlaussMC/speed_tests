using System;

namespace HelloWorld {
    class Hello {
        static void Main() {
            // startTime = DateTime.Now.Ticks / TimeSpan.TicksPerMillisecond;
            int startTime = (int)(DateTime.Now.Ticks / TimeSpan.TicksPerMillisecond);

            int statements = 0;

            while ((int)(DateTime.Now.Ticks / TimeSpan.TicksPerMillisecond) - startTime <= 1000) {
                statements++;
            }

            Console.WriteLine(statements);

        }
    }
}
