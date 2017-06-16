package Design;

import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

public abstract class CachedObjs<T>{
  long timeoutMillis;
  long lastRefreshTime;
  List<T> cache;

  //timeoutMillis, unit is millisecond
  public CachedObjs(long timeoutMillis){
    this.timeoutMillis = timeoutMillis;
    cache = new ArrayList<T>();
  }

  //if forceReload is true, then force refreshing all data
  public List<T> get(boolean forceReload){
    long millisCurrent = Calendar.getInstance().getTimeInMillis();
    if (forceReload || 0 == cache.size() || millisCurrent - lastRefreshTime >= timeoutMillis) {
      populateCache(cache);
    }
    return cache;
  }

  public void clear(){
    cache.clear();
  }
  protected abstract void populateCache(List<T> objects);
}
