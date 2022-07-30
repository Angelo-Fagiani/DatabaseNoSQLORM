package it.develhope.DatabaseNoSQLORM.repositories;

import it.develhope.DatabaseNoSQLORM.entities.Users;
import org.apache.catalina.User;
import org.springframework.data.mongodb.repository.MongoRepository;

//Le repositori(che sono sempre interfacce)sono dei servizi necessari per collegarci al nostro mongoDb
//la repositori è necessaria e  responsabile dei e per  lavorare sulle  entità,
public interface UserRepository extends MongoRepository<Users,String > {

}
