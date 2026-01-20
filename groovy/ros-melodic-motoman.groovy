node {
    git url: 'https://github.com/ros-industrial/motoman.git', branch: 'noetic-devel'
    registerROS('ros:melodic-desktop-full', [
        'ros-melodic-industrial-robot-client',
        'ros-melodic-joint-state-publisher-gui'
    ], [])
}
