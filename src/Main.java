# Membuat objek Hewan
        hewan = ["Sapi", "Kelinci", "Kambing", "Unta", "Domba"]

        # Membuat objek DeleteHewan
        deleteHewan = ["Kelinci", "Kambing", "Unta"]

        # Menghapus data dari objek Hewan yang sama dengan data warna yang terdapat pada objek DeleteHewan
        hewan = [animal for animal in hewan if animal not in deleteHewan]

        # Menampilkan hasil penghapusan data
        print("Hasil penghapusan data:")
        for animal in hewan:
        print(animal)