#include <iostream>

int main() {
    int rows, cols;
    std::cout << "Masukkan jumlah baris dan kolom: ";
    std::cin >> rows >> cols;

    int arr[rows][cols];

    std::cout << "Masukkan elemen-elemen array dua dimensi:" << std::endl;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            std::cin >> arr[i][j];
        }
    }

    std::cout << "Elemen-elemen array dua dimensi adalah:" << std::endl;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            std::cout << arr[i][j] << " ";
        }
        std::cout << std::endl;
    }

    return 0;
}
