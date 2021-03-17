<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 3/16/2021
  Time: 10:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<!-- Mirrored from omah.dexignzone.com/xhtml/app-profile.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 11 Nov 2020 01:51:16 GMT -->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>Omah - Property Bootstrap Admin Dashboard</title>
    <!-- Favicon icon -->
    <link rel="icon" type="image/png" sizes="16x16" href="Assets/images/favicon.png">
    <link href="Assets/vendor/bootstrap-select/dist/css/bootstrap-select.min.css" rel="stylesheet">
    <link href="Assets/css/style.css" rel="stylesheet">

</head>

<body>

<!--*******************
    Preloader start
********************-->
<div id="preloader">
    <div class="sk-three-bounce">
        <div class="sk-child sk-bounce1"></div>
        <div class="sk-child sk-bounce2"></div>
        <div class="sk-child sk-bounce3"></div>
    </div>
</div>
<!--*******************
    Preloader end
********************-->


<!--**********************************
    Main wrapper start
***********************************-->
<div id="main-wrapper">

    <!--**********************************
        Nav header start
    ***********************************-->
    <div class="nav-header">
        <a href="index.html" class="brand-logo">
            <img class="logo-abbr" src="images/logo.png" alt="">
            <img class="logo-compact" src="images/logo-text.png" alt="">
            <img class="brand-title" src="images/logo-text.png" alt="">
        </a>

        <div class="nav-control">
            <div class="hamburger">
                <span class="line"></span><span class="line"></span><span class="line"></span>
            </div>
        </div>
    </div>
    <div class="chatbox">
        <div class="chatbox-close"></div>
        <div class="custom-tab-1">
            <ul class="nav nav-tabs">
                <li class="nav-item">
                    <a class="nav-link" data-toggle="tab" href="#notes">Notes</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" data-toggle="tab" href="#alerts">Alerts</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" data-toggle="tab" href="#chat">Chat</a>
                </li>
            </ul>
            <div class="tab-content">
                <div class="tab-pane fade active show" id="chat" role="tabpanel">
                    <div class="card mb-sm-3 mb-md-0 contacts_card dz-chat-user-box">
                        <div class="card-header chat-list-header text-center">
                            <a href="#"><svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" width="18px" height="18px" viewBox="0 0 24 24" version="1.1"><g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd"><rect fill="#000000" x="4" y="11" width="16" height="2" rx="1"/><rect fill="#000000" opacity="0.3" transform="translate(12.000000, 12.000000) rotate(-270.000000) translate(-12.000000, -12.000000) " x="4" y="11" width="16" height="2" rx="1"/></g></svg></a>
                            <div>
                                <h6 class="mb-1">Chat List</h6>
                                <p class="mb-0">Show All</p>
                            </div>
                            <a href="#"><svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" width="18px" height="18px" viewBox="0 0 24 24" version="1.1"><g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd"><rect x="0" y="0" width="24" height="24"/><circle fill="#000000" cx="5" cy="12" r="2"/><circle fill="#000000" cx="12" cy="12" r="2"/><circle fill="#000000" cx="19" cy="12" r="2"/></g></svg></a>
                        </div>
                        <div class="card-body contacts_body p-0 dz-scroll  " id="DZ_W_Contacts_Body">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="header">
        <div class="header-content">
            <nav class="navbar navbar-expand">
                <div class="collapse navbar-collapse justify-content-between">
                    <div class="header-left">
                        <div class="dashboard_bar">
                            <div class="search_bar dropdown">
                                <div class="dropdown-menu p-0 m-0">
                                    <form action="product" method="get">
                                        <input class="form-control" type="search" name="name" placeholder="Search Here" aria-label="Search">
                                    </form>
                                </div>
                                <span class="search_icon p-3 c-pointer" data-toggle="dropdown"  >
                                    <svg width="24" height="24" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
										<path d="M23.7871 22.7761L17.9548 16.9437C19.5193 15.145 20.4665 12.7982 20.4665 10.2333C20.4665 4.58714 15.8741 0 10.2333 0C4.58714 0 0 4.59246 0 10.2333C0 15.8741 4.59246 20.4665 10.2333 20.4665C12.7982 20.4665 15.145 19.5193 16.9437 17.9548L22.7761 23.7871C22.9144 23.9255 23.1007 24 23.2816 24C23.4625 24 23.6488 23.9308 23.7871 23.7871C24.0639 23.5104 24.0639 23.0528 23.7871 22.7761ZM1.43149 10.2333C1.43149 5.38004 5.38004 1.43681 10.2279 1.43681C15.0812 1.43681 19.0244 5.38537 19.0244 10.2333C19.0244 15.0812 15.0812 19.035 10.2279 19.035C5.38004 19.035 1.43149 15.0865 1.43149 10.2333Z" fill="#3B4CB8"/>
									</svg>
                                </span>
                            </div>
                        </div>
                    </div>
                </div>
            </nav>
        </div>
    </div>
    <div class="deznav">
        <div class="deznav-scroll">
            <ul class="metismenu" id="menu">
                <li><a class="has-arrow ai-icon" href="javascript" aria-expanded="false">
                    <i class="flaticon-381-networking"></i>
                    <span class="nav-text">Dashboard</span>
                </a>
                </li>
                <li><a class="has-arrow ai-icon" href="javascript" aria-expanded="false">
                    <i class="flaticon-381-television"></i>
                    <span class="nav-text">Apps</span>
                </a>
                </li>
                <li><a class="has-arrow ai-icon" href="javascript" aria-expanded="false">
                    <i class="flaticon-381-controls-3"></i>
                    <span class="nav-text">Charts</span>
                </a>
                </li>
                <li><a class="has-arrow ai-icon" href="javascript" aria-expanded="false">
                    <i class="flaticon-381-internet"></i>
                    <span class="nav-text">Bootstrap</span>
                </a>
                </li>
                <li><a class="has-arrow ai-icon" href="javascript" aria-expanded="false">
                    <i class="flaticon-381-heart"></i>
                    <span class="nav-text">Plugins</span>
                </a>
                </li>
                <li><a href="widget-basic.html" class="ai-icon" aria-expanded="false">
                    <i class="flaticon-381-settings-2"></i>
                    <span class="nav-text">Widget</span>
                </a>
                </li>
                <li><a class="has-arrow ai-icon" href="javascript" aria-expanded="false">
                    <i class="flaticon-381-notepad"></i>
                    <span class="nav-text">Forms</span>
                </a>
                </li>
                <li><a class="has-arrow ai-icon" href="javascript" aria-expanded="false">
                    <i class="flaticon-381-network"></i>
                    <span class="nav-text">Table</span>
                </a>
                </li>
                <li><a class="has-arrow ai-icon" href="javascript" aria-expanded="false">
                    <i class="flaticon-381-layer-1"></i>
                    <span class="nav-text">Pages</span>
                </a>
                </li>
            </ul>

            <div class="copyright">
                <p><strong>Omah Dashboard</strong> ©All Rights Reserved</p>
                <p>by DexignZone</p>
            </div>
        </div>
    </div>
    <!--**********************************
        Sidebar end
    ***********************************-->

    <!--**********************************
        Content body start
    ***********************************-->
    <div class="content-body">
        <div class="container-fluid">
            <div class="page-titles">
                <ol class="breadcrumb">
                    <li class="breadcrumb-item"><a href="javascript:void(0)">App</a></li>
                    <li class="breadcrumb-item active"><a href="javascript:void(0)">Profile</a></li>
                </ol>
            </div>
            <!-- row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="profile card card-body px-3 pt-3 pb-0">
                        <div class="profile-head">
                            <div class="photo-content">
                                <div class="cover-photo"></div>
                            </div>
                            <div class="profile-info">
                                <div class="profile-photo">
                                    <img src="images/profile/profile.png" class="img-fluid rounded-circle" alt="">
                                </div>
                                <div class="profile-details">
                                    <div class="profile-name px-3 pt-2">
                                        <h4 class="text-primary mb-0">Mitchell C. Shay</h4>
                                        <p>UX / UI Designer</p>
                                    </div>
                                    <div class="profile-email px-2 pt-2">
                                        <h4 class="text-muted mb-0">hello@email.com</h4>
                                        <p>Email</p>
                                    </div>
                                    <div class="dropdown ml-auto">
                                        <a href="#" class="btn btn-primary light sharp" data-toggle="dropdown" aria-expanded="true"><svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" width="18px" height="18px" viewBox="0 0 24 24" version="1.1"><g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd"><rect x="0" y="0" width="24" height="24"></rect><circle fill="#000000" cx="5" cy="12" r="2"></circle><circle fill="#000000" cx="12" cy="12" r="2"></circle><circle fill="#000000" cx="19" cy="12" r="2"></circle></g></svg></a>
                                        <ul class="dropdown-menu dropdown-menu-right">
                                            <li class="dropdown-item"><i class="fa fa-user-circle text-primary mr-2"></i> View profile</li>
                                            <li class="dropdown-item"><i class="fa fa-users text-primary mr-2"></i> Add to close friends</li>
                                            <li class="dropdown-item"><i class="fa fa-plus text-primary mr-2"></i> Add to group</li>
                                            <li class="dropdown-item"><i class="fa fa-ban text-primary mr-2"></i> Block</li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-xl-4">
                    <div class="card">
                        <div class="card-body">
                            <div class="profile-statistics mb-5">
                                <div class="text-center">
                                    <div class="row">
                                        <div class="col">
                                            <h3 class="m-b-0">150</h3><span>Follower</span>
                                        </div>
                                        <div class="col">
                                            <h3 class="m-b-0">140</h3><span>Place Stay</span>
                                        </div>
                                        <div class="col">
                                            <h3 class="m-b-0">45</h3><span>Reviews</span>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="profile-news">
                                <h5 class="text-primary d-inline">Our Latest News</h5>
                                <div class="media pt-3 pb-3">
                                    <img src="images/profile/5.jpg" alt="image" class="mr-3 rounded" width="75">
                                    <div class="media-body">
                                        <h5 class="m-b-5">Collection of textile samples</h5>
                                        <p class="mb-0">I shared this on my fb wall a few months back, and I thought.</p>
                                    </div>
                                </div>
                                <div class="media pt-3 pb-3">
                                    <img src="images/profile/6.jpg" alt="image" class="mr-3 rounded" width="75">
                                    <div class="media-body">
                                        <h5 class="m-b-5">Collection of textile samples</h5>
                                        <p class="mb-0">I shared this on my fb wall a few months back, and I thought.</p>
                                    </div>
                                </div>
                                <div class="media pt-3 pb-3">
                                    <img src="images/profile/7.jpg" alt="image" class="mr-3 rounded" width="75">
                                    <div class="media-body">
                                        <h5 class="m-b-5">Collection of textile samples</h5>
                                        <p class="mb-0">I shared this on my fb wall a few months back, and I thought.</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-xl-8">
                    <div class="card">
                        <div class="card-body">
                            <div class="profile-tab">
                                <div class="custom-tab-1">
                                    <ul class="nav nav-tabs">
                                        <li class="nav-item"><a href="#my-posts" data-toggle="tab" class="nav-link active show">Posts</a>
                                        </li>
                                        <li class="nav-item"><a href="#about-me" data-toggle="tab" class="nav-link">About Me</a>
                                        </li>
                                        <li class="nav-item"><a href="#profile-settings" data-toggle="tab" class="nav-link">Setting</a>
                                        </li>
                                    </ul>
                                    <div class="tab-content">
                                        <div id="my-posts" class="tab-pane fade active show">
                                            <div class="my-post-content pt-3">
                                                <div class="profile-uoloaded-post border-bottom-1 pb-5">
                                                    <img src="images/profile/9.jpg" alt="" class="img-fluid">
                                                    <p>A wonderful serenity has take possession of my entire soul like these sweet morning of spare which enjoy whole heart.A wonderful serenity has take possession of my entire soul like these sweet morning
                                                        of spare which enjoy whole heart.</p>
                                                    <button class="btn btn-primary mr-2"><span class="mr-2"><i
                                                            class="fa fa-heart"></i></span>Like</button>
                                                    <button class="btn btn-secondary"><span class="mr-2"><i
                                                            class="fa fa-reply"></i></span>Reply</button>
                                                </div>
                                                <div class="profile-uoloaded-post pb-5">
                                                    <img src="images/profile/8.jpg" alt="" class="img-fluid">
                                                    <p>A wonderful serenity has take possession of my entire soul like these sweet morning of spare which enjoy whole heart.A wonderful serenity has take possession of my entire soul like these sweet morning
                                                        of spare which enjoy whole heart.</p>
                                                    <button class="btn btn-primary mr-2"><span class="mr-2"><i
                                                            class="fa fa-heart"></i></span>Like</button>
                                                    <button class="btn btn-secondary"><span class="mr-2"><i
                                                            class="fa fa-reply"></i></span>Reply</button>
                                                </div>
                                            </div>
                                        </div>
                                        <div id="about-me" class="tab-pane fade">
                                            <div class="profile-about-me">
                                                <div class="pt-4 border-bottom-1 pb-3">
                                                    <h4 class="text-primary">About Me</h4>
                                                    <p class="mb-2">A wonderful serenity has taken possession of my entire soul, like these sweet mornings of spring which I enjoy with my whole heart. I am alone, and feel the charm of existence was created for the bliss of souls like mine.I am so happy, my dear friend, so absorbed in the exquisite sense of mere tranquil existence, that I neglect my talents.</p>
                                                    <p>A collection of textile samples lay spread out on the table - Samsa was a travelling salesman - and above it there hung a picture that he had recently cut out of an illustrated magazine and housed in a nice, gilded frame.</p>
                                                </div>
                                            </div>
                                            <div class="profile-personal-info">
                                                <h4 class="text-primary mb-4">Personal Information</h4>
                                                <div class="row mb-2">
                                                    <div class="col-3">
                                                        <h5 class="f-w-500">Name <span class="pull-right">:</span>
                                                        </h5>
                                                    </div>
                                                    <div class="col-9"><span>Mitchell C.Shay</span>
                                                    </div>
                                                </div>
                                                <div class="row mb-2">
                                                    <div class="col-3">
                                                        <h5 class="f-w-500">Email <span class="pull-right">:</span>
                                                        </h5>
                                                    </div>
                                                    <div class="col-9"><span>example@examplel.com</span>
                                                    </div>
                                                </div>
                                                <div class="row mb-2">
                                                    <div class="col-3">
                                                        <h5 class="f-w-500">Availability <span class="pull-right">:</span></h5>
                                                    </div>
                                                    <div class="col-9"><span>Full Time (Free Lancer)</span>
                                                    </div>
                                                </div>
                                                <div class="row mb-2">
                                                    <div class="col-3">
                                                        <h5 class="f-w-500">Age <span class="pull-right">:</span>
                                                        </h5>
                                                    </div>
                                                    <div class="col-9"><span>27</span>
                                                    </div>
                                                </div>
                                                <div class="row mb-2">
                                                    <div class="col-3">
                                                        <h5 class="f-w-500">Location <span class="pull-right">:</span></h5>
                                                    </div>
                                                    <div class="col-9"><span>Rosemont Avenue Melbourne,
                                                                Florida</span>
                                                    </div>
                                                </div>
                                                <div class="row mb-2">
                                                    <div class="col-3">
                                                        <h5 class="f-w-500">Year Experience <span class="pull-right">:</span></h5>
                                                    </div>
                                                    <div class="col-9"><span>07 Year Experiences</span>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div id="profile-settings" class="tab-pane fade">
                                            <div class="pt-3">
                                                <div class="settings-form">
                                                    <h4 class="text-primary">Account Setting</h4>
                                                    <form>
                                                        <div class="form-row">
                                                            <div class="form-group col-md-6">
                                                                <label>Email</label>
                                                                <input type="email" placeholder="Email" class="form-control">
                                                            </div>
                                                            <div class="form-group col-md-6">
                                                                <label>Password</label>
                                                                <input type="password" placeholder="Password" class="form-control">
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label>Address</label>
                                                            <input type="text" placeholder="1234 Main St" class="form-control">
                                                        </div>
                                                        <div class="form-group">
                                                            <label>Address 2</label>
                                                            <input type="text" placeholder="Apartment, studio, or floor" class="form-control">
                                                        </div>
                                                        <div class="form-row">
                                                            <div class="form-group col-md-6">
                                                                <label>City</label>
                                                                <input type="text" class="form-control">
                                                            </div>
                                                            <div class="form-group col-md-4">
                                                                <label>State</label>
                                                                <select class="form-control" id="inputState">
                                                                    <option selected="">Choose...</option>
                                                                    <option>Option 1</option>
                                                                    <option>Option 2</option>
                                                                    <option>Option 3</option>
                                                                </select>
                                                            </div>
                                                            <div class="form-group col-md-2">
                                                                <label>Zip</label>
                                                                <input type="text" class="form-control">
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="custom-control custom-checkbox">
                                                                <input type="checkbox" class="custom-control-input" id="gridCheck">
                                                                <label class="custom-control-label" for="gridCheck"> Check me out</label>
                                                            </div>
                                                        </div>
                                                        <button class="btn btn-primary" type="submit">Sign
                                                            in</button>
                                                    </form>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--**********************************
        Content body end
    ***********************************-->


    <!--**********************************
        Footer start
    ***********************************-->
    <div class="footer">
        <div class="copyright">
            <p>Copyright © Designed &amp; Developed by <a href="http://dexignzone.com/" target="_blank">DexignZone</a> 2020</p>
        </div>
    </div>
    <!--**********************************
        Footer end
    ***********************************-->

    <!--**********************************
       Support ticket button start
    ***********************************-->

    <!--**********************************
       Support ticket button end
    ***********************************-->


</div>
<!--**********************************
    Main wrapper end
***********************************-->

<!--removeIf(production)-->

<!--**********************************
    Scripts
***********************************-->
<!-- Required vendors -->
<script src="vendor/global/global.min.js"></script>
<script src="vendor/bootstrap-select/dist/js/bootstrap-select.min.js"></script>
<script src="js/custom.min.js"></script>
<script src="js/deznav-init.js"></script>







</body>


<!-- Mirrored from omah.dexignzone.com/xhtml/app-profile.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 11 Nov 2020 01:51:18 GMT -->
</html>
