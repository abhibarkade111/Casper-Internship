package com.example.artcasper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

import java.security.Permission;
import java.util.Map;

public class FindNearToilet extends AppCompatActivity {

    SupportMapFragment smf;
    FusedLocationProviderClient client;
    ImageView qr_button,back_btn;
    Button feedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_near_toilet);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        smf = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.google_map);
        client = LocationServices.getFusedLocationProviderClient(this);
        qr_button = findViewById(R.id.qr_button);
        feedback  =findViewById(R.id.feedback);
        back_btn = findViewById(R.id.back_button);

        qr_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FindNearToilet.this, ScanQrCodeActivity.class));
            }
        });

        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FindNearToilet.this, FeedbackActivity.class));
            }
        });
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FindNearToilet.super.onBackPressed();
            }
        });
        Dexter.withContext(getApplicationContext())
                .withPermission(Manifest.permission.ACCESS_FINE_LOCATION)
                .withListener(new PermissionListener() {
                    @Override
                    public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                        getmylocation();
                    }

                    @Override
                    public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                        permissionToken.continuePermissionRequest();
                    }
                }).check();

    }


    public void getmylocation() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }

        Task<Location> task = client.getLastLocation();
        task.addOnSuccessListener(new OnSuccessListener<Location>() {
            @Override
            public void onSuccess(final Location location) {
                smf.getMapAsync(new OnMapReadyCallback() {
                    @Override
                    public void onMapReady(GoogleMap googleMap) {
                        LatLng latLng=new LatLng(location.getLatitude(),location.getLongitude());
                        LatLng latLng1=new LatLng(location.getLatitude()+0.0012,location.getLongitude()+0.0012);
                        LatLng latLng4=new LatLng(location.getLatitude()-0.0018,location.getLongitude()-0.0015);
                        LatLng latLng2=new LatLng(location.getLatitude()-0.0008,location.getLongitude()+0.0006);
                        LatLng latLng3=new LatLng(location.getLatitude()+0.0020,location.getLongitude()-0.0012);
                        Log.d("lng","lt"+location.getLatitude()+" lang"+location.getLongitude());
                        MarkerOptions markerOptions=new MarkerOptions().position(latLng).title("ART Pvt");
                        MarkerOptions markerOptions1=new MarkerOptions().position(latLng1).title("ART Pub");
                        MarkerOptions markerOptions2=new MarkerOptions().position(latLng2).title("ART Pvt");
                        MarkerOptions markerOptions3=new MarkerOptions().position(latLng3).title("ART Pub");
                        MarkerOptions markerOptions4=new MarkerOptions().position(latLng4).title("ART Pub");
                        googleMap.addMarker(markerOptions);
                        googleMap.addMarker(markerOptions1);
                        googleMap.addMarker(markerOptions2);
                        googleMap.addMarker(markerOptions3);
                        googleMap.addMarker(markerOptions4);
                        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,17));
                    }
                });
            }
        });
    }
}