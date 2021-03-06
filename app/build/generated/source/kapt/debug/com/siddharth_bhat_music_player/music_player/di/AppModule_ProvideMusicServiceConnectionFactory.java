// Generated by Dagger (https://dagger.dev).
package com.siddharth_bhat_music_player.music_player.di;

import android.content.Context;
import com.siddharth_bhat_music_player.music_player.exoplayer.MusicServiceConnection;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideMusicServiceConnectionFactory implements Factory<MusicServiceConnection> {
  private final Provider<Context> contextProvider;

  public AppModule_ProvideMusicServiceConnectionFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public MusicServiceConnection get() {
    return provideMusicServiceConnection(contextProvider.get());
  }

  public static AppModule_ProvideMusicServiceConnectionFactory create(
      Provider<Context> contextProvider) {
    return new AppModule_ProvideMusicServiceConnectionFactory(contextProvider);
  }

  public static MusicServiceConnection provideMusicServiceConnection(Context context) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideMusicServiceConnection(context));
  }
}
