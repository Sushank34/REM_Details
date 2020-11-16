package com.example.project_rem;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class Developers extends AppCompatActivity {
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private DrawerLayout drawerLayout;
    private ListView drawerListView;
    private String[] drawerListViewItems;
    int finishflag = 1;
    int flag1;
    int flag2;
    int flag3;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.activity_developers);
        ((ImageView) findViewById(R.id.fbnic)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent browserIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/nikit.prabhu.7"));
                    Developers.this.finishflag = 0;
                    Developers.this.startActivity(browserIntent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ((ImageView) findViewById(R.id.linnik)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent browserIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.linkedin.com/in/sairpa/"));
                    Developers.this.finishflag = 0;
                    Developers.this.startActivity(browserIntent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ((ImageView) findViewById(R.id.gitnic)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent browserIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/sairpa"));
                    Developers.this.finishflag = 0;
                    Developers.this.startActivity(browserIntent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ((ImageView) findViewById(R.id.fbtanuj)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent browserIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/sushank.sushank.53135"));
                    Developers.this.finishflag = 0;
                    Developers.this.startActivity(browserIntent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ((ImageView) findViewById(R.id.lintanuj)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent browserIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.linkedin.com/in/sushank-sakthivel-nagarajan-30256617b/"));
                    Developers.this.finishflag = 0;
                    Developers.this.startActivity(browserIntent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ((ImageView) findViewById(R.id.gittanuj)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent browserIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/sushank"));
                    Developers.this.finishflag = 0;
                    Developers.this.startActivity(browserIntent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ((ImageView) findViewById(R.id.fbtanuj2)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent browserIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/somnath.gokul"));
                    Developers.this.finishflag = 0;
                    Developers.this.startActivity(browserIntent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ((ImageView) findViewById(R.id.lintanuj2)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent browserIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.linkedin.com/in/somnath-p-2841551a4/"));
                    Developers.this.finishflag = 0;
                    Developers.this.startActivity(browserIntent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ((ImageView) findViewById(R.id.gittanuj2)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent browserIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/somnath"));
                    Developers.this.finishflag = 0;
                    Developers.this.startActivity(browserIntent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ((ImageView) findViewById(R.id.fbtanuj3)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent browserIntent = new Intent("android.intent.action.VIEW", Uri.parse("hhttps://www.facebook.com/subramanyam.kunda"));
                    Developers.this.finishflag = 0;
                    Developers.this.startActivity(browserIntent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ((ImageView) findViewById(R.id.lintanuj3)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent browserIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.linkedin.com/in/sushank-sakthivel-nagarajan-30256617b/"));
                    Developers.this.finishflag = 0;
                    Developers.this.startActivity(browserIntent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ((ImageView) findViewById(R.id.gittanuj3)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent browserIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/subramanayam"));
                    Developers.this.finishflag = 0;
                    Developers.this.startActivity(browserIntent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ((ImageView) findViewById(R.id.imageView2)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Developers.this.finish();
                if (Build.VERSION.SDK_INT >= 14) {
                    Developers.this.overridePendingTransition(R.anim.activity_open_scale, R.anim.activity_close_translate);
                }
            }
        });
        ((Button) findViewById(R.id.fbbutton)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent browserIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/REM"));
                    Developers.this.finishflag = 0;
                    Developers.this.startActivity(browserIntent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ((Button) findViewById(R.id.gmailbutton)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent emailIntent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "sushank82000@gmail.com", (String) null));
                    emailIntent.putExtra("android.intent.extra.SUBJECT", "Enquiry");
                    Developers.this.finishflag = 0;
                    Developers.this.startActivity(Intent.createChooser(emailIntent, "Send email..."));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (this.finishflag == 1) {
            finish();
            if (Build.VERSION.SDK_INT >= 14) {
                overridePendingTransition(R.anim.activity_open_scale, R.anim.activity_close_translate);
            }
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        finish();
        if (Build.VERSION.SDK_INT >= 14) {
            overridePendingTransition(R.anim.activity_open_scale, R.anim.activity_close_translate);
        }
    }
}
