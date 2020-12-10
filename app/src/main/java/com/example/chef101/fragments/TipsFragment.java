package com.example.chef101.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.chef101.R;
import com.example.chef101.fragments.helper_fragments.TipsHelperFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TipsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TipsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TipsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TipsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TipsFragment newInstance(String param1, String param2) {
        TipsFragment fragment = new TipsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tips, container, false);

        CustomViewPagerAdapter adapter = new CustomViewPagerAdapter(getChildFragmentManager());
        ViewPager viewPager = view.findViewById(R.id.tipsViewPager);
        viewPager.setAdapter(adapter);

        return view;
    }

    public static class CustomViewPagerAdapter extends FragmentPagerAdapter {
        public CustomViewPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                default:
                    return TipsHelperFragment.newInstance("Control your heat. Don't let the pan become too hot or not hot enough.");
                case 1:
                    return TipsHelperFragment.newInstance("Chop with the rear part of the blade, not the tip, in a rolling motion.");
                case 2:
                    return TipsHelperFragment.newInstance("Don't overcrowd the pan. There won't be enough heat or direct contact to brown or crisp whatever you're cooking.");
                case 3:
                    return TipsHelperFragment.newInstance("A dull knife is more dangerous than a sharp knife. Dull blades may cause slippage or may require you to cut with more pressure both of which can lead to injury.");
                case 4:
                    return TipsHelperFragment.newInstance("A falling knife has no handle. If a knife happens to fall to the ground do not try to catch it, step back as quickly as possible.");
                case 5:
                    return TipsHelperFragment.newInstance("Always taste your food while cooking, even if you are serving it to someone else. This can help you make adjustments on seasonings and cook time.");
                case 6:
                    return TipsHelperFragment.newInstance("Clean as you go. A clean workspace will increase your efficiency in the kitchen.");
                case 7:
                    return TipsHelperFragment.newInstance("Be creative with recipes. When following recipes feel encouraged to \"spice\" things up by adding ingredients or doing things in a different way. If it sounds good to you then try it!");
            }
        }

        @Override
        public int getCount() {
            return 8;
        }
    }
}