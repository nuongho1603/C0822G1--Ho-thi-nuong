<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/7/2022
  Time: 8:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

<html>
  <head>
    <title>Home Furama </title>
  </head>
  <body>
  <div class="row bg-light">
    <div class="col-3 " style="padding: 10px">
      <img src="https://cdn.nhanlucnganhluat.vn/uploads/images/051D288B/logo/2018-12/Logo-FURAMA-RESORT.jpg" height="100" width="100" /></div>
    <div class="col-3 "> <a href="https://www.tripadvisor.com/Hotel_Review-g298085-d302750-Reviews-Furama_Resort_Danang-Da_Nang.html"> <
      <img src="https://smartdata.tonytemplates.com/bestel/wp-content/uploads/2018/05/widget-tripadvisor-logo.png" height="100" width="300"/> </a></div>
    <div class="col-3">
      <p> <img src="https://e7.pngegg.com/pngimages/98/498/png-clipart-computer-icons-address-book-gps-tracking-angle-text.png" height="50" width="50"/>
        103 - 105 Vo Nguyen Giap Street, Khue My Ward, Ngu Hanh Son District, Danang City, Vietnam 7,0 km from Danang Airport</p>
    </div>
    <div class="col-3">
        <pre>
            <img src="https://tse4.mm.bing.net/th?id=OIP.zBov_4E-lB1WDZv942ufBQAAAA&pid=Api&P=0" height="20" width="20"/>  84-236-3847 333/888
            <img src="https://tse2.mm.bing.net/th?id=OIP.RuPJf5uOjrbyyx1uwVI4lQHaHa&pid=Api&P=0" height="20" width="20"/>  reservation@furamavietnam.com
        </pre>
    </div>
  </div>

  <div>
    <ul class="nav justify-content-center bg-black">
      <li class="nav-item">
        <a class="nav-link active text-white" aria-current="page" href="#">HOME</a>
      </li>
      <li class="nav-item">
        <a class="nav-link text-white" href="#">EMPLOYEE </a>
      </li>
      <li class="nav-item">
        <a class="nav-link text-white" href="/customer">CUSTOMER</a>
      </li>
      <li class="nav-item text-decoration-none">
        <a class="nav-link text-white" href="/facility">SERVICE</a>
      </li>
      <li class="nav-item">
        <a class="nav-link text-white" href="#">CONTRACT</a>
      </li>
    </ul>
  </div>

  <div>
    <div id="carouselExampleDark" class="carousel carousel-dark slide" data-bs-ride="carousel">
      <div class="carousel-indicators">
        <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
        <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="1" aria-label="Slide 2"></button>
        <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="2" aria-label="Slide 3"></button>
      </div>
      <div class="carousel-inner">
        <div class="carousel-item active" data-bs-interval="10000">
          <img src="https://pix6.agoda.net/hotelImages/276/276357/276357_14032009240018778001.jpg"  height="640" width="960" class="d-block w-100" alt="Furama rerort Da Nang">
          <div class="carousel-caption d-none d-md-block">
            <h5>First slide label</h5>
            <p>Some representative placeholder content for the first slide.</p>
          </div>
        </div>
        <div class="carousel-item" data-bs-interval="2000">
          <img src="https://dynamic-media-cdn.tripadvisor.com/media/photo-o/19/33/46/b6/furama-silom-rooftop.jpg?w=900&h=-1&s=1" height="640" width="960" class="d-block w-100" alt="Furama rerort Da Nang">
          <div class="carousel-caption d-none d-md-block">
            <h5>Second slide label</h5>
            <p>Some representative placeholder content for the second slide.</p>
          </div>
        </div>
        <div class="carousel-item">
          <img src="https://www.chudu24.com/wp-content/uploads/2018/11/furama.jpg" height="640" width="960" class="d-block w-100" alt="Furama rerort Da Nang">
          <div class="carousel-caption d-none d-md-block">
            <h5>Third slide label</h5>
            <p>Some representative placeholder content for the third slide.</p>
          </div>
        </div>
      </div>
      <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Previous</span>
      </button>
      <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Next</span>
      </button>
    </div>

  </div>

  <div class="row" style="margin: 30px">
    <div class="col-4"> <h3 style="color: #505050; font-size: 30px">THIS WORLD CLASS RESORT, FURAMA DANANG, REPUTABLE FOR BEING A CULINARY RESORT IN VIETNAM</h3></div>
    <div class="col-5">
      <iframe width="560" height="315" src="https://www.youtube.com/embed/IjlT_4mvd-c" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
    </div>
    <div class="col-3"><h6 style="font-family: Ebrima; color: indigo; font-size: 15px">
      Overlooking the long stretch of wide white sand on Danang Beach, Furama Resort Danang is a gateway to three World Heritage Sites of Hoi An (20 minutes),
      My Son (90 minutes) and Hue (2 hours). The 198 rooms and suites plus 70 two to four bedroom pool villas feature tasteful décor, designed with traditional
      Vietnamese style and a touch of French colonial architecture and guarantee the Vietnam’s the most prestigious resort -counting royalty, presidents, movie stars and international business leaders among its celebrity guests.</h6></div>
  </div>

  </body>
</html>
