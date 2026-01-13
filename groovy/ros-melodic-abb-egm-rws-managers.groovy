node {
    git url: "https://github.com/ros-industrial/abb_egm_rws_managers.git", branch: "master"
    registerROS('ros:melodic-desktop-full',
        ['ros-melodic-abb-libegm', 'ros-melodic-abb-librws'],
        ['ros-melodic-abb-libegm', 'ros-melodic-abb-librws']
    )
}
