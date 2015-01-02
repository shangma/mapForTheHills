package info.shangma.testmap;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity implements OnMapReadyCallback {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		MapFragment mapFragment = (MapFragment) getFragmentManager()
				.findFragmentById(R.id.map);
		mapFragment.getMapAsync(this);

	}

	@Override
	public void onMapReady(GoogleMap map) {
		// TODO Auto-generated method stub
	    map.addMarker(new MarkerOptions()
        .position(new LatLng(0, 0))
        .title("Marker"));

	}
}
