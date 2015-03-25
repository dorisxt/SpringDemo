/*
 * File Name: MemcachedServiceImpl.java
 * Class Name: MemcachedServiceImpl
 *
 * Copyright 2014 Hengtian Software Inc
 *
 * Licensed under the Hengtiansoft
 *
 * http://www.hengtiansoft.com
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package doris.practice.springIocPractice.service.impl;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.MemcachedClientBuilder;
import net.rubyeye.xmemcached.XMemcachedClientBuilder;
import net.rubyeye.xmemcached.exception.MemcachedException;
import net.rubyeye.xmemcached.impl.KetamaMemcachedSessionLocator;
import net.rubyeye.xmemcached.utils.AddrUtil;

/**
 * @author tingxing
 *
 */
public class MemcachedServiceImpl {
    
    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException, MemcachedException{
//        
        int weight[] = {1,2};
        MemcachedClientBuilder builder = new XMemcachedClientBuilder(  
                AddrUtil.getAddresses("172.16.129.90:11211 172.16.15.148:11211"), weight );  
//        MemcachedClientBuilder builder = new XMemcachedClientBuilder();  
        builder.setSessionLocator(new KetamaMemcachedSessionLocator());
//        builder.setConnectionPoolSize(50);   
        MemcachedClient client  = builder.build();
//        client.addServer("172.16.15.148:11211 172.16.129.90:11211");
//        client.addServer("172.16.129.90:11211 172.16.15.148:11211");
//        client.addServer("172.16.129.90:11211");
//        client.addServer("172.16.15.148:11211");
//        System.out.println(client.get("test"));
//        System.out.println(client.get("sex"));
          client.set("ABCDEF", 1800, "574893753489");
          System.out.println(client.get("TEST"));
//        client.set("work", 1800, "play");
//        System.out.println(client.gets("work"));
    }
    
    
    

}
