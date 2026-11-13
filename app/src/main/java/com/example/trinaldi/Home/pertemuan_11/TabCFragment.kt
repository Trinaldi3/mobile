package com.example.trinaldi.Home.pertemuan_11

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.trinaldi.databinding.FragmentTabCBinding

class TabCFragment : Fragment() {
    private var _binding: FragmentTabCBinding? = null
    private val binding get() = _binding!!

    private val productList = listOf(
        ProductModel("Sepatu Running Nike", "Rp 850.000", "https://cdn.dummyjson.com/product-images/mens-shoes/nike-air-jordan-1-red-and-black/1.webp"),
        ProductModel("Kemeja Flannel", "Rp 320.000", "https://cdn.dummyjson.com/product-images/mens-shirts/blue-&-black-check-shirt/1.webp"),
        ProductModel("Tas Ransel Laptop", "Rp 450.000", "https://cdn.dummyjson.com/product-images/womens-bags/blue-women's-handbag/1.webp"),
        ProductModel("Jam Tangan Casio", "Rp 1.200.000", "https://cdn.dummyjson.com/product-images/mens-watches/brown-leather-belt-watch/1.webp"),
        ProductModel("Headphone Sony", "Rp 1.500.000", "https://cdn.dummyjson.com/product-images/mobile-accessories/apple-airpods-max-silver/1.webp"),
        ProductModel("Kaos Polos Premium", "Rp 150.000", "https://cdn.dummyjson.com/product-images/mens-shirts/man-short-sleeve-shirt/1.webp"),
        ProductModel("Celana Jogger", "Rp 280.000", "https://cdn.dummyjson.com/product-images/mens-shirts/gigabyte-aorus-men-tshirt/1.webp"),
        ProductModel("Sneakers Adidas", "Rp 950.000", "https://cdn.dummyjson.com/product-images/mens-shoes/sports-sneakers-off-white-&-red/1.webp"),
        ProductModel("Dompet Kulit", "Rp 220.000", "https://cdn.dummyjson.com/product-images/womens-bags/heshe-women's-leather-bag/1.webp"),
        ProductModel("Topi Baseball", "Rp 120.000", "https://cdn.dummyjson.com/product-images/sports-accessories/baseball-ball/1.webp"),

        ProductModel("Mouse Gaming RGB", "Rp 275.000", "https://cdn.dummyjson.com/product-images/mobile-accessories/apple-airpods/1.webp"),
        ProductModel("Keyboard Mechanical", "Rp 780.000", "https://cdn.dummyjson.com/product-images/laptops/apple-macbook-pro-14-inch-space-grey/1.webp"),
        ProductModel("Monitor LG 24 Inch", "Rp 2.100.000", "https://cdn.dummyjson.com/product-images/laptops/asus-zenbook-pro-dual-screen-laptop/1.webp"),
        ProductModel("Power Bank 20000mAh", "Rp 350.000", "https://cdn.dummyjson.com/product-images/mobile-accessories/amazon-echo-plus/1.webp"),
        ProductModel("Charger Fast Charging", "Rp 180.000", "https://cdn.dummyjson.com/product-images/mobile-accessories/apple-magsafe-battery-pack/1.webp"),
        ProductModel("Kacamata Hitam", "Rp 260.000", "https://cdn.dummyjson.com/product-images/sunglasses/black-sun-glasses/1.webp"),
        ProductModel("Sandal Gunung", "Rp 340.000", "https://cdn.dummyjson.com/product-images/mens-shoes/puma-future-rider-trainers/1.webp"),
        ProductModel("Jaket Hoodie", "Rp 410.000", "https://cdn.dummyjson.com/product-images/mens-shirts/man-plaid-shirt/1.webp"),
        ProductModel("Speaker Bluetooth", "Rp 620.000", "https://cdn.dummyjson.com/product-images/mobile-accessories/beats-flex-wireless-earphones/1.webp"),
        ProductModel("Tripod Kamera", "Rp 290.000", "https://cdn.dummyjson.com/product-images/mobile-accessories/selfie-stick-monopod/1.webp"),

        ProductModel("Action Camera", "Rp 1.750.000", "https://cdn.dummyjson.com/product-images/mobile-accessories/selfie-lamp-with-iphone/1.webp"),
        ProductModel("Smartphone Samsung", "Rp 4.500.000", "https://cdn.dummyjson.com/product-images/smartphones/samsung-galaxy-s10/1.webp"),
        ProductModel("Tablet Xiaomi", "Rp 3.250.000", "https://cdn.dummyjson.com/product-images/tablets/ipad-mini-2021-starlight/1.webp"),
        ProductModel("Laptop ASUS", "Rp 8.900.000", "https://cdn.dummyjson.com/product-images/laptops/new-dell-xps-13-9300-laptop/1.webp"),
        ProductModel("Printer Epson", "Rp 2.350.000", "https://cdn.dummyjson.com/product-images/laptops/huawei-matebook-x-pro/1.webp"),
        ProductModel("Flashdisk 64GB", "Rp 95.000", "https://cdn.dummyjson.com/product-images/mobile-accessories/iphone-12-silicone-case-with-magsafe-plum/1.webp"),
        ProductModel("Harddisk External", "Rp 850.000", "https://cdn.dummyjson.com/product-images/mobile-accessories/apple-homepod-mini-cosmic-grey/1.webp"),
        ProductModel("Kursi Gaming", "Rp 1.950.000", "https://cdn.dummyjson.com/product-images/furniture/annibale-colombo-sofa/1.webp"),
        ProductModel("Meja Kerja Minimalis", "Rp 1.450.000", "https://cdn.dummyjson.com/product-images/furniture/wooden-bathroom-sink-with-mirror/1.webp"),
        ProductModel("Lampu LED RGB", "Rp 175.000", "https://cdn.dummyjson.com/product-images/home-decoration/table-lamp/1.webp"),

        ProductModel("Kompor Portable", "Rp 230.000", "https://cdn.dummyjson.com/product-images/kitchen-accessories/electric-stove/1.webp"),
        ProductModel("Blender Philips", "Rp 540.000", "https://cdn.dummyjson.com/product-images/kitchen-accessories/silver-pot-with-glass-cap/1.webp"),
        ProductModel("Rice Cooker", "Rp 480.000", "https://cdn.dummyjson.com/product-images/kitchen-accessories/rice-cooker/1.webp"),
        ProductModel("Vacuum Cleaner", "Rp 1.250.000", "https://cdn.dummyjson.com/product-images/kitchen-accessories/microwave-oven/1.webp"),
        ProductModel("Dispenser Air", "Rp 780.000", "https://cdn.dummyjson.com/product-images/kitchen-accessories/glass/1.webp"),
        ProductModel("Botol Minum Tumbler", "Rp 110.000", "https://cdn.dummyjson.com/product-images/kitchen-accessories/water-bottle/1.webp"),
        ProductModel("Payung Lipat", "Rp 95.000", "https://cdn.dummyjson.com/product-images/home-decoration/decoration-swing/1.webp"),
        ProductModel("Bantal Leher Travel", "Rp 85.000", "https://cdn.dummyjson.com/product-images/home-decoration/family-tree-photo-frame/1.webp"),
        ProductModel("Koper Kabin", "Rp 680.000", "https://cdn.dummyjson.com/product-images/womens-bags/prada-women-bag/1.webp"),
        ProductModel("Sepeda Lipat", "Rp 3.800.000", "https://cdn.dummyjson.com/product-images/vehicle/charger-sxt-rigger/1.webp"),

        ProductModel("Helm Full Face", "Rp 920.000", "https://cdn.dummyjson.com/product-images/motorcycle/generic-motorcycle/1.webp"),
        ProductModel("Sarung Tangan Motor", "Rp 140.000", "https://cdn.dummyjson.com/product-images/sports-accessories/baseball-glove/1.webp"),
        ProductModel("Rak Buku Minimalis", "Rp 520.000", "https://cdn.dummyjson.com/product-images/furniture/knoll-saarinen-executive-conference-chair/1.webp"),
        ProductModel("Novel Best Seller", "Rp 98.000", "https://cdn.dummyjson.com/product-images/home-decoration/house-showpiece-plant/1.webp"),
        ProductModel("Paket Alat Lukis", "Rp 350.000", "https://cdn.dummyjson.com/product-images/home-decoration/plant-pot/1.webp"),
        ProductModel("Gitar Akustik", "Rp 1.600.000", "https://cdn.dummyjson.com/product-images/sports-accessories/tennis-racket/1.webp"),
        ProductModel("Piano Keyboard", "Rp 2.750.000", "https://cdn.dummyjson.com/product-images/laptops/lenovo-yoga-920/1.webp"),
        ProductModel("Drone Mini", "Rp 1.950.000", "https://cdn.dummyjson.com/product-images/mobile-accessories/apple-watch-series-4-gold/1.webp"),
        ProductModel("Smartwatch Xiaomi", "Rp 670.000", "https://cdn.dummyjson.com/product-images/mens-watches/rolex-cellini-date-black-dial/1.webp"),
        ProductModel("Router WiFi", "Rp 430.000", "https://cdn.dummyjson.com/product-images/mobile-accessories/beats-flex-wireless-earphones/1.webp")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTabCBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = ProductAdapter(productList) { selectedItem ->
            Toast.makeText(requireContext(), "Anda memilih ${selectedItem.name}", Toast.LENGTH_SHORT).show()
        }

        binding.rvProducts.apply {
            /** Mode Grid **/
            layoutManager = GridLayoutManager(requireContext(), 2)

            /** Jika ingin model Linear **/
            //layoutManager = LinearLayoutManager(requireContext())

            this.adapter = adapter
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}