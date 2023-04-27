public class ServiceStation {
    public void  check(Service service){
        service.services();
    }
    public void  checkAll(Service[]services){
        for (Service service : services){
            service.services();
        }
    }

        }
    
