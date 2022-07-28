import entities.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<AuthorityOfUser> authorityOfUsers = new ArrayList<AuthorityOfUser>();
        List<ApplicationStatus> applicationStatuses = new ArrayList<ApplicationStatus>();
        List<CustomerOfBank> customerOfBanks = new ArrayList<CustomerOfBank>();
        List<BankPersonnel> bankPersonnels = new ArrayList<BankPersonnel>();
        List<KosgebPersonnel> kosgebPersonnels = new ArrayList<KosgebPersonnel>();
        List<Attribute> attributes = new ArrayList<Attribute>();
        List<Entrepreneur> bannedLists = new ArrayList<>();


        CorporateCustomer corporateCustomer1 = new CorporateCustomer(2,"corporate@info.com","123456",authorityOfUsers,"11111",applicationStatuses,"11111","ABC");
        Entrepreneur entrepreneur1 = new Entrepreneur(3,"berkan@gmail.com","123456",authorityOfUsers,"22222",applicationStatuses,"Berkan","Aslan","2222222");
        Entrepreneur entrepreneur2 = new Entrepreneur(10,"adsakj@hotmail.com","asndsnakja",authorityOfUsers,"1000000",applicationStatuses,"adsadadsd","adsadssa","000000");
        Bank bank1 = new Bank(1,"Ziraat Bankası",customerOfBanks);
        BankPersonnelTittle bankPersonnelTittle = new BankPersonnelTittle(1,"Financial Manager",bankPersonnels);
        KosgebPersonnelTittle kosgebPersonnelTittle = new KosgebPersonnelTittle(1,"KOSGEB Çalışan",kosgebPersonnels);
        ApplicationType applicationType = new ApplicationType(1,"KOBİ",applicationStatuses);
        AuthorityOfUser authorityOfUser = new AuthorityOfUser();
        authorityOfUser.setId(1);
        authorityOfUser.setUser(entrepreneur1);
        Authority authority = new Authority(1,"Görüntülemek",authorityOfUser);
        authorityOfUser.setAuthority(authority);




        AuthorityOfUser authorityOfUser2 = new AuthorityOfUser();
        authorityOfUser2.setId(2);
        authorityOfUser2.setUser(entrepreneur2);
        Authority authority2 = new Authority(2,"Onaylamak",authorityOfUser2);
        authorityOfUser2.setAuthority(authority2);

        CreditVariety creditVariety = new CreditVariety(1,"Destek kredisi");
        Credit credit = new Credit();
        credit.setId(1);

        CreditType creditType = new CreditType(1, LocalDate.parse("2022-07-28"),LocalDate.parse("2023-07-28"),creditVariety,credit);
        credit.setCreditType(creditType);

        CreditAttribute creditAttribute = new CreditAttribute(1,credit,attributes);
        Attribute attribute = new Attribute(1,"Alt limit",100,creditAttribute);

        ApplicationStatus applicationStatus = new ApplicationStatus(1,applicationType,entrepreneur1,credit);
        CustomerOfBank customerOfBank1 = new CustomerOfBank(4,"eda@gmail.com","12356",authorityOfUsers,"123456",applicationStatuses,"Eda Kevser","Demir",bank1);
        BankPersonnel bankPersonnel = new BankPersonnel(8,"iibrahim@gmail.com","123456",authorityOfUsers,"İbrahim","Kaplan",bankPersonnelTittle);
        KosgebPersonnel kosgebPersonnel = new KosgebPersonnel(5,"atakan@gmail.com","1246",authorityOfUsers,"Atakan","Keçeci",kosgebPersonnelTittle);

        ApplicationStatus applicationStatus2 = new ApplicationStatus(2,applicationType,entrepreneur2,credit);

        authorityOfUsers.add(authorityOfUser);
        applicationStatuses.add(applicationStatus);
       customerOfBanks.add(customerOfBank1);
       bankPersonnels.add(bankPersonnel);
       kosgebPersonnels.add(kosgebPersonnel);
       attributes.add(attribute);
       authorityOfUsers.add(authorityOfUser2);
       applicationStatuses.add(applicationStatus2);

        bannedLists.add(entrepreneur2);

        System.out.println(entrepreneur1.getApplicationStatuses().get(0).getCredit().getCreditType().getCreditVariety().getCreditName());
        System.out.println(authorityOfUsers.get(0).getUser().getEmail());
        System.out.println(authorityOfUsers.get(1).getAuthority().getAuthorityType());
        System.out.println(applicationStatuses.get(1).getCustomer().getCustomerNumber());
        System.out.println(bannedLists.get(0).getFirstName());



    }
}
