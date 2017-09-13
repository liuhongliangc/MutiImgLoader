package com.abbott.mutiimageloader;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;

import com.abbott.mutiimgloader.circularavatar.CircularImageView;
import com.abbott.mutiimgloader.util.ImageLoader;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    ArrayList<Bitmap> mBmps1 = new ArrayList<Bitmap>();
    ArrayList<Bitmap> mBmps2 = new ArrayList<Bitmap>();
    ArrayList<Bitmap> mBmps3 = new ArrayList<Bitmap>();
    ArrayList<Bitmap> mBmps4 = new ArrayList<Bitmap>();
    ArrayList<Bitmap> mBmps5 = new ArrayList<Bitmap>();

    CircularImageView mImageView1;
    CircularImageView mImageView2;
    CircularImageView mImageView3;
    CircularImageView mImageView4;
    CircularImageView mImageView5;

    static List<String> urls = new ArrayList<>();

    static {
        urls.add("https://ss0.bdstatic.com/94oJfD_bAAcT8t7mm9GUKT-xh_/timg?image&quality=100&size=b4000_4000&sec=1505294718&di=b6934dd570c0c6962a8dbbb12eac27f5&src=http://www.zhlzw.com/UploadFiles/Article_UploadFiles/201204/20120412123914329.jpg");
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1505304803685&di=3a859c35334d8d86177f0cfb8adfdc65&imgtype=0&src=http%3A%2F%2Fwww.zhlzw.com%2FUploadFiles%2FArticle_UploadFiles%2F201204%2F20120412123926750.jpg");
        urls.add("https://ss0.bdstatic.com/94oJfD_bAAcT8t7mm9GUKT-xh_/timg?image&quality=100&size=b4000_4000&sec=1505307059&di=f0681cbe5ff7604b9cd62bdb7b071e6c&src=http://b.zol-img.com.cn/sjbizhi/images/2/750x530/1354868342195.jpg");
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1505317145477&di=ebea82181a485571bddea5ad41b0b841&imgtype=0&src=http%3A%2F%2Fi3.sinaimg.cn%2Fgm%2F2011%2F1103%2FU4511P115DT20111103112522.jpg");
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1505317145477&di=26e3b5ab30a9fdcc0b077bc9eea340e1&imgtype=0&src=http%3A%2F%2Fww2.sinaimg.cn%2Fmw600%2F6b146538jw1dztjeivhpuj.jpg");
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1505317145476&di=9dfc96ab94f153e49cb2db2da09a97cf&imgtype=0&src=http%3A%2F%2Fwww.discuz.images.zq.sd.cn%2FDiscuz%2Fforum%2F201308%2F30%2F193725qm9qwzz7qidmqqmq.jpg");
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1505317145476&di=fa19d31e36fd331242a014910a13669a&imgtype=0&src=http%3A%2F%2F9.pic.pc6.com%2Fthumb%2Fup%2F2014-6%2F14019543202414731_600_0.jpg");
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1505317401448&di=dc4492aeeb496dc73880c63c439186d6&imgtype=jpg&src=http%3A%2F%2Fimg2.imgtn.bdimg.com%2Fit%2Fu%3D877642269%2C2202333197%26fm%3D214%26gp%3D0.jpg");
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1505317145471&di=4f9b528159a635467f39746b91139829&imgtype=0&src=http%3A%2F%2Fwww.16sucai.com%2Fuploadfile%2F2011%2F1009%2F20111009041805525.jpg");
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1505317145471&di=086a4eed6ca7f934fe1c3765940cf867&imgtype=0&src=http%3A%2F%2Fb.zol-img.com.cn%2Fsjbizhi%2Fimages%2F6%2F320x510%2F1382519980823.jpg");
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1505317145471&di=a6fc4073f44d99befc39fe3c30be688f&imgtype=0&src=http%3A%2F%2Fb.zol-img.com.cn%2Fsjbizhi%2Fimages%2F6%2F320x510%2F1395393066343.jpg");
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1505317145471&di=35cbde9ae1b124fedbdaa96a258297fb&imgtype=0&src=http%3A%2F%2Fb.zol-img.com.cn%2Fsjbizhi%2Fimages%2F5%2F320x510%2F1372754988391.jpg");
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1505317145470&di=19d439fa1a302aef8fd2fcadfbca771c&imgtype=0&src=http%3A%2F%2Fww2.sinaimg.cn%2Fmw600%2F6b146538jw1dztje3wasfj.jpg");
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1505317523533&di=a1fef3d8ef1dcbd564c9e59d6ac6c3d5&imgtype=jpg&src=http%3A%2F%2Fimg4.imgtn.bdimg.com%2Fit%2Fu%3D2277168614%2C4145779101%26fm%3D214%26gp%3D0.jpg");
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1505317145469&di=e9d63be606584c29bc5bc8abf109dc9d&imgtype=0&src=http%3A%2F%2Fs4.sinaimg.cn%2Fmw690%2F609f8b00gd5ee83e31233%26690");
        urls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1505317488354&di=996c983ba9cd30bf04b6bd684b0167ce&imgtype=0&src=http%3A%2F%2Fs6.sinaimg.cn%2Fmiddle%2F10bc65e44c8d713456d55%26960");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // test data
        Bitmap avatar1 = BitmapFactory.decodeResource(getResources(), R.drawable.headshow1);
        Bitmap avatar2 = BitmapFactory.decodeResource(getResources(), R.drawable.headshow2);
        Bitmap avatar3 = BitmapFactory.decodeResource(getResources(), R.drawable.headshow3);
        Bitmap avatar4 = BitmapFactory.decodeResource(getResources(), R.drawable.headshow4);
        Bitmap avatar5 = BitmapFactory.decodeResource(getResources(), R.drawable.headshow5);

        mBmps1.add(avatar1);
        mBmps2.add(avatar1);
        mBmps3.add(avatar1);
        mBmps4.add(avatar1);
        mBmps5.add(avatar1);

        mBmps2.add(avatar2);
        mBmps3.add(avatar2);
        mBmps4.add(avatar2);
        mBmps5.add(avatar2);

        mBmps3.add(avatar3);
        mBmps4.add(avatar3);
        mBmps5.add(avatar3);

        mBmps4.add(avatar4);
        mBmps5.add(avatar4);

        mBmps5.add(avatar5);

        mImageView1 = (CircularImageView) findViewById(R.id.circularImageView1);
        mImageView2 = (CircularImageView) findViewById(R.id.circularImageView2);
        mImageView3 = (CircularImageView) findViewById(R.id.circularImageView3);
        mImageView4 = (CircularImageView) findViewById(R.id.circularImageView4);
        mImageView5 = (CircularImageView) findViewById(R.id.circularImageView5);

        mImageView1.setImageBitmaps(mBmps1);
        mImageView2.setImageBitmaps(mBmps2);
        mImageView3.setImageBitmaps(mBmps3);
        mImageView4.setImageBitmaps(mBmps4);
        mImageView5.setImageBitmaps(mBmps5);

//        new ImageLoader(this).displayImages(urls,mImageView1,200,200);

        CircularImageView mImageView21 = (CircularImageView) findViewById(R.id.circularImageView21);
        CircularImageView mImageView22 = (CircularImageView) findViewById(R.id.circularImageView22);
        CircularImageView mImageView23 = (CircularImageView) findViewById(R.id.circularImageView23);
        CircularImageView mImageView24 = (CircularImageView) findViewById(R.id.circularImageView24);
        CircularImageView mImageView25 = (CircularImageView) findViewById(R.id.circularImageView25);

        mImageView21.setImageBitmaps(mBmps1);
        mImageView22.setImageBitmaps(mBmps2);
        mImageView23.setImageBitmaps(mBmps3);
        mImageView24.setImageBitmaps(mBmps4);
        mImageView25.setImageBitmaps(mBmps5);

        CircularImageView mImageView31 = (CircularImageView) findViewById(R.id.circularImageView31);
        CircularImageView mImageView32 = (CircularImageView) findViewById(R.id.circularImageView32);
        CircularImageView mImageView33 = (CircularImageView) findViewById(R.id.circularImageView33);
        CircularImageView mImageView34 = (CircularImageView) findViewById(R.id.circularImageView34);
        CircularImageView mImageView35 = (CircularImageView) findViewById(R.id.circularImageView35);

        mImageView31.setImageBitmaps(mBmps1);
        mImageView32.setImageBitmaps(mBmps2);
        mImageView33.setImageBitmaps(mBmps3);
        mImageView34.setImageBitmaps(mBmps4);
        mImageView35.setImageBitmaps(mBmps5);

    }

    public void onBitmapBtnClick(View view) {
        startActivity(new Intent(this, RecyclerActivity.class));
    }
}
