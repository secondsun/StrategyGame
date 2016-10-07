package net.sagaoftherealms.games.strategygame.game;

import android.graphics.Bitmap;
import android.view.SurfaceHolder;

import net.sagaoftherealms.games.strategygame.MainGamePanel;
import net.sagaoftherealms.games.strategygame.input.InputManagerCompat;
import net.sagaoftherealms.games.strategygame.input.JoyPadDelegate;

import java.io.IOException;
import java.util.List;

/**
 * Created by summers on 10/4/16.
 */
public class BattleScene implements Scene,  InputManagerCompat.InputDeviceListener {

    public BattleScene(SurfaceHolder surfaceHolder, MainGamePanel gamePanel) {
    }

    @Override
    public void setup() throws IOException {

    }

    @Override
    public void teardown() {

    }

    @Override
    public void handleInput() {

    }

    @Override
    public void updateGameWorld() {

    }

    @Override
    public List<Bitmap> render() {
        return null;
    }

    @Override
    public JoyPadDelegate createJoypadDelegate() {
        return null;
    }

    @Override
    public JoyPadDelegate getJoypadDelegate() {
        return null;
    }


    @Override
    public void onInputDeviceAdded(int deviceId) {

    }

    @Override
    public void onInputDeviceChanged(int deviceId) {

    }

    @Override
    public void onInputDeviceRemoved(int deviceId) {

    }
}
