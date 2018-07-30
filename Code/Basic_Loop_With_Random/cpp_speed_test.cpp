#include <chrono>
#include <iostream>

using namespace std;

int main() {
    using namespace std::chrono;

    __int64 startTime = std::chrono::duration_cast<std::chrono::milliseconds>(std::chrono::system_clock::now().time_since_epoch()).count();
    int statements = 0;

    while ((std::chrono::duration_cast<std::chrono::milliseconds>(std::chrono::system_clock::now().time_since_epoch()).count()) - startTime <= 1000) {
        statements++;
    }
    cout << statements << endl;

    return 0;
}
