package com.JonesRandom.crudmysql.API;



import com.JonesRandom.crudmysql.Model.ModelData;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by JhonDev on 05/10/2016.
 */

public interface ApiService {

    @FormUrlEncoded
    @POST("tambah_data.php")
    Call<ResponseBody> tambahData(@Field("nama") String nama, @Field("jenis") String jenis, @Field("keterangan") String keterangan);

    @FormUrlEncoded
    @POST("edit_data.php")
    Call<ResponseBody> editData(@Field("id_barang") String id,@Field("nama_barang") String nama,@Field("jenis_barang") String jenis, @Field("keterangan_barang")String keterangan);

    @FormUrlEncoded
    @POST("hapus_data.php")
    Call<ResponseBody> hapusData(@Field("id_barang") String id_barang);

    @GET("semua_data.php")
    Call<List<ModelData>> getSemuaBarang();

    @GET("single_data.php")
    Call<List<ModelData>> getSingleData(@Query("id_barang") String id);

}
