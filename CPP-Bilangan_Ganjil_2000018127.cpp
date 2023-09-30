#include <iostream>

int main() {
    int N;
    std::cout << "Masukkan nilai N: ";
    std::cin >> N;

    std::cout << "Bilangan ganjil dari 1 hingga " << N << " adalah:" << std::endl;
    int i = 1;
    while (i <= N) {
        if (i % 2 != 0) {
            std::cout << i << " ";
        }
        i++;
    }

    std::cout << std::endl;
    return 0;
}
