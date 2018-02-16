package com.example.bhavin.tictactoe;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static android.R.attr.x;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);

        turn = 1;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b1.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b1.setText("O");
                    }
                }
                endGame();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b2.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b2.setText("O");
                    }
                }
                endGame();

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b3.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b3.setText("O");
                    }
                }
                endGame();


            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b4.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b4.setText("O");
                    }
                }
                endGame();


            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b5.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b5.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b5.setText("O");
                    }
                }
                endGame();


            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b6.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b6.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b6.setText("O");
                    }
                }
                endGame();


            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b7.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b7.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b7.setText("O");
                    }
                }
                endGame();

            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b8.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b8.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b8.setText("O");
                    }
                }
                endGame();


            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b9.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b9.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b9.setText("O");
                    }
                }
                endGame();

            }
        });


    }

    public void endGame() {
        String s1, s2, s3, s4, s5, s6, s7, s8, s9;

        boolean end = false;

        s1 = b1.getText().toString();
        s2 = b2.getText().toString();
        s3 = b3.getText().toString();

        s4 = b4.getText().toString();
        s5 = b5.getText().toString();
        s6 = b6.getText().toString();

        s7 = b7.getText().toString();
        s8 = b8.getText().toString();
        s9 = b9.getText().toString();

        if (s1.equals(s2) && s1.equals(s3) && s1.equals("X") && s2.equals("X") && s3.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;

        }
        if (s1.equals(s5) && s1.equals(s9) && s1.equals("X") && s5.equals("X") && s9.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;

        }

        if (s1.equals(s4) && s1.equals(s7) && s1.equals("X") && s4.equals("X") && s7.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;

        }

        if (s2.equals(s5) && s1.equals(s8) && s2.equals("X") && s5.equals("X") && s8.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;

        }

        if (s3.equals(s6) && s3.equals(s9) && s3.equals("X") && s6.equals("X") && s9.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;

        }

        if (s4.equals(s5) && s4.equals(s6) && s4.equals("X") && s5.equals("X") && s6.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;

        }

        if (s4.equals(s1) && s4.equals(s7) && s4.equals("X") && s1.equals("X") && s7.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;

        }

        if (s5.equals(s2) && s5.equals(s8) && s5.equals("X") && s2.equals("X") && s8.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;

        }

        if (s5.equals(s1) && s5.equals(s9) && s5.equals("X") && s1.equals("X") && s9.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;

        }

        if (s6.equals(s3) && s6.equals(s9) && s6.equals("X") && s3.equals("X") && s9.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;

        }

        if (s7.equals(s1) && s7.equals(s4) && s7.equals("X") && s1.equals("X") && s4.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;

        }

        if (s7.equals(s5) && s7.equals(s3) && s7.equals("X") && s5.equals("X") && s3.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;

        }

        if (s7.equals(s8) && s7.equals(s9) && s7.equals("X") && s8.equals("X") && s9.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;

        }

        if (s8.equals(s7) && s8.equals(s9) && s8.equals("X") && s7.equals("X") && s9.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;
        }

        if (s8.equals(s5) && s8.equals(s2) && s8.equals("X") && s2.equals("X") && s5.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;

        }

        if (s9.equals(s5) && s9.equals(s1) && s1.equals("X") && s9.equals("X") && s5.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;

        }
        if (s9.equals(s8) && s9.equals(s7) && s9.equals("X") && s8.equals("X") && s7.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;

        }
        if (s9.equals(s6) && s9.equals(s3) && s9.equals("X") && s6.equals("X") && s3.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;

        }

        if (s1.equals(s2) && s1.equals(s3) && s1.equals("O") && s2.equals("O") && s3.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;

        }

        if (s1.equals(s5) && s1.equals(s9) && s1.equals("O") && s5.equals("O") && s9.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;
        }

        if (s1.equals(s4) && s1.equals(s7) && s1.equals("O") && s4.equals("O") && s7.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;
        }

        if (s2.equals(s5) && s1.equals(s8) && s2.equals("O") && s5.equals("O") && s8.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;
        }

        if (s3.equals(s6) && s3.equals(s9) && s3.equals("O") && s6.equals("O") && s9.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;
        }

        if (s4.equals(s5) && s4.equals(s6) && s4.equals("O") && s5.equals("O") && s6.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;
        }

        if (s4.equals(s1) && s4.equals(s7) && s4.equals("O") && s1.equals("O") && s7.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;
        }

        if (s5.equals(s2) && s5.equals(s8) && s5.equals("O") && s2.equals("O") && s8.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;
        }

        if (s5.equals(s1) && s5.equals(s9) && s5.equals("O") && s1.equals("O") && s9.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;
        }

        if (s6.equals(s3) && s6.equals(s9) && s6.equals("O") && s3.equals("O") && s9.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;
        }

        if (s7.equals(s1) && s7.equals(s4) && s7.equals("O") && s1.equals("O") && s4.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;
        }

        if (s7.equals(s5) && s7.equals(s3) && s7.equals("O") && s5.equals("O") && s3.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;
        }

        if (s7.equals(s8) && s7.equals(s9) && s7.equals("O") && s8.equals("O") && s9.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;
        }

        if (s8.equals(s7) && s8.equals(s9) && s8.equals("O") && s7.equals("O") && s9.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;
        }

        if (s8.equals(s5) && s8.equals(s2) && s8.equals("O") && s2.equals("O") && s5.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;
        }

        if (s9.equals(s5) && s9.equals(s1) && s1.equals("O") && s9.equals("O") && s5.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;
        }
        if (s9.equals(s8) && s9.equals(s7) && s9.equals("O") && s8.equals("O") && s7.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;
        }
        if (s9.equals(s6) && s9.equals(s3) && s9.equals("O") && s6.equals("O") && s3.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
            end = true;
        }

       if (end) {

            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
    }

}
